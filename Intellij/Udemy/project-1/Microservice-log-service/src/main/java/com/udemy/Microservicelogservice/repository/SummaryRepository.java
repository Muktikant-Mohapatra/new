package com.udemy.Microservicelogservice.repository;

import com.udemy.Microservicelogservice.model.Summary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface SummaryRepository extends JpaRepository<Summary,String> {
    Optional<Summary> findByCourseId(String courseId);
@Query("select id from Summary")
    List<Summary> findAllPopularCourse();
}
