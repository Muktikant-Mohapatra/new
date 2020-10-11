package com.udemy.Microservicelogservice.repository;

import com.udemy.Microservicelogservice.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LogRepository extends JpaRepository<Log,String> {

    Optional<Log> findByCourseId(String courseId);
}
