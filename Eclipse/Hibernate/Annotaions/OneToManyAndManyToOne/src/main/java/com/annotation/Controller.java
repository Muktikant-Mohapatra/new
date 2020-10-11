package com.annotation;

import java.util.Optional;
import java.util.Set;

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
		Book book1 = new Book();
		book.setName("Spring");
		UserEntity user = new UserEntity();
		user.setName("Kanha");
		user.getBooks().add(book1);
		user.getBooks().add(book);
		book.setUser(user);
		book1.setUser(user);
		br.save(book);
		
		br.save(book1);
		
		//rs.save(user);
		return "success";
	}

	@GetMapping("/show/{id}")
	public UserRequest showUser(@PathVariable String id) {
		Optional<UserEntity> findById = rs.findById(id);
		UserEntity userEntity = findById.get();
		UserRequest request = new UserRequest();
		request.setId(userEntity.getUser_id());
		request.setName(userEntity.getName());
		request.setBooks(userEntity.getBooks());
		return request;
	}
}
