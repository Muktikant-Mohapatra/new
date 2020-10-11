package com.annotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.annotation.table.Employee;
@Repository
public interface SecondaryTableRepository extends JpaRepository<Employee, String>{
 
}
