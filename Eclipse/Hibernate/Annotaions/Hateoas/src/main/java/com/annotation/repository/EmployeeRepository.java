package com.annotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.annotation.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {

}
