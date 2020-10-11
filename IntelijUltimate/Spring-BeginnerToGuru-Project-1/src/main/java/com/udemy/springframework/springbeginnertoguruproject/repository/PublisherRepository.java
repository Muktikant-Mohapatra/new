package com.udemy.springframework.springbeginnertoguruproject.repository;

import com.udemy.springframework.springbeginnertoguruproject.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, String> {
}
