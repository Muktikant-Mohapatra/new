package com.udemy.Microservicelogservice.service;

import com.udemy.Microservicelogservice.model.Log;
import com.udemy.Microservicelogservice.model.Summary;

import java.util.List;

public interface LogService {
    Log saveOrUpdate(Log log);

    List<Summary> findAllPopularCourse();

    Summary findSummaryByCourseId(String courseId);
}
