package com.udemy.MicroserviceCourseManagement.repository;

import com.udemy.MicroserviceCourseManagement.model.Transaction;

import java.util.List;

public interface TransactionRepository extends IGenericDao<Transaction> {
    List<Transaction> findAllTransactionOfUser(String userId);

    List<Transaction> findAllTransactionOfCourse(String courseId);
}
