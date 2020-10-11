package com.udemy.MicroserviceCourseManagement.service;

import com.udemy.MicroserviceCourseManagement.model.Course;
import com.udemy.MicroserviceCourseManagement.model.Transaction;

import java.util.List;

public interface CourseService {
    List<Course> allCourses();

    List<Course> filterCoursesByIdList(List<String> idList);

    List<Course> filterCourses(String content);

    List<Transaction> filterTransactionsOfUser(String userId);

    List<Transaction> filterTransactionsOfCourse(String courseId);

    void saveTransaction(Transaction transaction);

    Course findCourseById(String courseId);
}
