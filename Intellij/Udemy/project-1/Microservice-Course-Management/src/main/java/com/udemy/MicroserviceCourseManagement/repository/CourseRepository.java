package com.udemy.MicroserviceCourseManagement.repository;

import com.udemy.MicroserviceCourseManagement.model.Course;

import java.util.List;

public interface CourseRepository extends IGenericDao<Course> {
    List<Course> filterCourses(String text);

    List<Course> filterCoursesByIdList(List<String> idList);
}
