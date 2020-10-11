package com.udemy.springframework.springbeginnertoguruproject.bootstrap;

import com.udemy.springframework.springbeginnertoguruproject.model.Author;
import com.udemy.springframework.springbeginnertoguruproject.model.Book;
import com.udemy.springframework.springbeginnertoguruproject.model.Publisher;
import com.udemy.springframework.springbeginnertoguruproject.repository.AuthorRepository;
import com.udemy.springframework.springbeginnertoguruproject.repository.BookRepository;
import com.udemy.springframework.springbeginnertoguruproject.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        //Eric
        Author eric = new Author("eric", "das");
        Publisher publisher1 = new Publisher("aaa", "bbb");
        Book add = new Book("halfGF", publisher1);

        eric.getBooks().add(add);
        // add.getAuthors().add(eric);
        System.out.println(eric);
        System.out.println("end1");
        authorRepository.save(eric);
        System.out.println("end2");
        publisherRepository.save(publisher1);
        bookRepository.save(add);
        System.out.println("end3 ");

        System.out.println("end4");
        //Chetan bhagat
        Author chetan = new Author("chetan", "bhagat");
        Publisher publisher2 = new Publisher("ccc", "ddd");
        Book add1 = new Book("halfGF", publisher2);
        eric.getBooks().add(add1);
        //add.getAuthors().add(chetan);
        authorRepository.save(chetan);
        publisherRepository.save(publisher2);
        bookRepository.save(add1);

        System.out.println(chetan);
    }
}
