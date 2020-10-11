package com.annotation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private UserRepository rs;
	@Autowired
	private BookRepository br;

	@GetMapping("/save")
	public String saveUser() {
		Book book = new Book();
		book.setName("Hibernate");
		UserEntity user = new UserEntity();
		user.setName("Kanha");
		user.setBook(book);
		br.save(book);
		rs.save(user);
		return "success";
	}

	@GetMapping("/show/{id}")
	public UserRequest showUser(@PathVariable String id) {
		Optional<UserEntity> findById = rs.findById(id);
		UserEntity userEntity = findById.get();
		UserRequest request = new UserRequest();
		request.setId(userEntity.getUser_id());
		request.setName(userEntity.getName());
		request.setBook(userEntity.getBook());
		return request;
	}
}
