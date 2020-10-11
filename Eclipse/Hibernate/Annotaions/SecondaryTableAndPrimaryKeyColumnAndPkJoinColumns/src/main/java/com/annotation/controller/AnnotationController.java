package com.annotation.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.annotation.controller.rest.RestEmployee;
import com.annotation.repository.SecondaryTableRepository;
import com.annotation.table.Employee;

@RestController
public class AnnotationController {
	@Autowired
  private SecondaryTableRepository repository;
	@PostMapping("/annotation")
	public RestEmployee annotation(@RequestBody RestEmployee restEmployee) {
        ModelMapper mapper=new ModelMapper();
        Employee emp=mapper.map(restEmployee, Employee.class);
        Employee savedEmp = repository.save(emp);
        RestEmployee restEmp=mapper.map(savedEmp, RestEmployee.class);
		return restEmp;
	}
}
