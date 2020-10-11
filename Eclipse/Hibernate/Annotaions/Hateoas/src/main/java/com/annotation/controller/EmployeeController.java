package com.annotation.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.annotation.entity.EmployeeEntity;
import com.annotation.repository.EmployeeRepository;
import com.annotation.request.RestEmployeeRequest;
import com.annotation.response.RestEmployeeResponse;

@RestController
@RequestMapping("/IBM")
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;

	@GetMapping("/employees/{id}")
	public ResponseEntity<RestEmployeeResponse> getEmployee(@PathVariable String id) {
		Optional<EmployeeEntity> findById = repository.findById(id);
		EmployeeEntity emp = findById.get();
		ModelMapper mapper = new ModelMapper();
		RestEmployeeRequest request=mapper.map(emp, RestEmployeeRequest.class);
		Link withRel = WebMvcLinkBuilder.linkTo((methodOn(EmployeeController.class).deleteEmployee(id)))
				.withRel("delete");
		Link createRel = WebMvcLinkBuilder.linkTo((methodOn(EmployeeController.class).createEmployee(request)))
				.withRel("create");
		
		RestEmployeeResponse response = mapper.map(emp, RestEmployeeResponse.class);
		response.add(withRel);
		response.add(createRel);
		return ResponseEntity();
	}

	@PutMapping("/employees/employee/{id}")
	public ResponseEntity deleteEmployee(@PathVariable String id) {
		repository.deleteById(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	@PostMapping("/employees/employee")
	public RestEmployeeResponse createEmployee(@RequestBody RestEmployeeRequest request) {
		ModelMapper mapper=new ModelMapper();
		EmployeeEntity entity=mapper.map(request, EmployeeEntity.class);
		EmployeeEntity save = repository.save(entity);
		RestEmployeeResponse response=mapper.map(save, RestEmployeeResponse.class);
		return response;
	}

}
