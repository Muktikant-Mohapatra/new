package com.annotation;

import java.util.HashSet;
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
	@Autowired
	private PublisherRepository pr;

	@GetMapping("/save")
	public String saveUser() {
		Publisher publisher1 = new Publisher();
		publisher1.setName("Hibernate Publisher");

		Book book1 = new Book();
		book1.setName("Hibernate");
		

		Users user = new Users();
		user.setName("Kanha");
		
		
		Set<Publisher> publishers=new HashSet<Publisher>();
		publishers.add(publisher1);
		Set<Book>
		// user.getBook().add(book2);

		publisher1.getBook().add(book1);

		rs.save(user);
		br.save(book1);
		pr.save(publisher1);
		return "success";
	}

	@GetMapping("/show/{id}")
	public Users showUser(@PathVariable String id) {
		Optional<Users> findById = rs.findById(id);
		Users userEntity = findById.get();
		Users request = new Users();
		request.setId(userEntity.getId());
		request.setName(userEntity.getName());
		request.setBook(userEntity.getBook());
		return request;
	}
}
