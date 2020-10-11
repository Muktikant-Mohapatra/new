package com.udemy.MicroserviceCourseManagement.service;

import com.udemy.MicroserviceCourseManagement.model.Course;
import com.udemy.MicroserviceCourseManagement.model.Transaction;
import com.udemy.MicroserviceCourseManagement.repository.CourseRepository;
import com.udemy.MicroserviceCourseManagement.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Course> allCourses() {
        return courseRepository.findAll();
    }

    @Override
    public List<Course> filterCoursesByIdList(final List<String> idList){
        return courseRepository.filterCoursesByIdList(idList);
    }

    @Override
    public List<Course> filterCourses(final String content) {
        return courseRepository.filterCourses(content);
    }

    @Override
    public List<Transaction> filterTransactionsOfUser(final String userId){
        return transactionRepository.findAllTransactionOfCourse(userId);
    }

    @Override
    public List<Transaction> filterTransactionsOfCourse(final String courseId){
        return transactionRepository.findAllTransactionOfCourse(courseId);
    }

    @Override
    public void saveTransaction(final Transaction transaction){
        transactionRepository.save(transaction);
    }

    @Override
    public Course findCourseById(String courseId){
        return courseRepository.find(courseId);
    }
}
