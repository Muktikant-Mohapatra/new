package com.annotation.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.annotation.controller.rest.RestAddress;
import com.annotation.controller.rest.RestEmployee;
import com.annotation.repository.AddressRepository;
import com.annotation.repository.SecondaryTableRepository;
import com.annotation.table.Address;
import com.annotation.table.Employee;

@RestController
public class AnnotationController {
	@Autowired
  private SecondaryTableRepository repository;
	@Autowired
	private AddressRepository addressRepository;
	@PostMapping("/annotation")
	public RestEmployee annotation(@RequestBody RestEmployee restEmployee) {
		ModelMapper mapper=new ModelMapper();
        Employee emp=mapper.map(restEmployee, Employee.class);
        RestAddress address = restEmployee.getAddress();
        Address address_entity=mapper.map(address, Address.class);
        	 Address savedAddress=addressRepository.save(address_entity);
        
        emp.setAddress(address_entity);
        Employee savedEmp=repository.save(emp);
        RestEmployee restEmp=mapper.map(savedEmp, RestEmployee.class);
		return restEmp;
	}
}
