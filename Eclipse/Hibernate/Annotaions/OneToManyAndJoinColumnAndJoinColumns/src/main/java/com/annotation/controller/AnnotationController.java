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
        List<Address> listOfAddress=new ArrayList<Address>();
		ModelMapper mapper=new ModelMapper();
        Employee emp=mapper.map(restEmployee, Employee.class);
        Employee savedEmp=repository.save(emp);
        List<RestAddress> address = restEmployee.getAddress();
        for (RestAddress restAddress : address) {
        	Address adder=mapper.map(restAddress, Address.class);
        	 Address savedAddress=addressRepository.save(adder);
        	 listOfAddress.add(adder);
        }
		/*
		 * emp.setAddress(listOfAddress); Employee savedEmp=repository.save(emp);
		 */
        RestEmployee restEmp=mapper.map(savedEmp, RestEmployee.class);
		return restEmp;
	}
}
