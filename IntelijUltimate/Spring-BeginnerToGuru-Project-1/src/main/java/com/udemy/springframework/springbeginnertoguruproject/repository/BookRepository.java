package com.udemy.springframework.springbeginnertoguruproject.repository;

import com.udemy.springframework.springbeginnertoguruproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
}
