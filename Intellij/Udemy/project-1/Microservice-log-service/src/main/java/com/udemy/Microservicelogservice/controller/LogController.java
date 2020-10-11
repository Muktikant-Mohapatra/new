package com.udemy.Microservicelogservice.controller;

import com.udemy.Microservicelogservice.model.Log;
import com.udemy.Microservicelogservice.model.Summary;
import com.udemy.Microservicelogservice.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
public class LogController {
    @Autowired
    private LogService logService;

    @PostMapping("/service/create")
    public ResponseEntity<?> saveLog(@RequestBody Log log) {
        //get local date
        LocalDateTime date = LocalDateTime.now();
        //type cast local date to java.sql.Date and set to the log
        log.setLogDate(java.sql.Date.valueOf(date.toLocalDate()));
        //save or update log
        logService.saveOrUpdate(log);
        //response code 200 ok
        return ResponseEntity.ok(log);
    }

    @GetMapping("/service/popular")
    public ResponseEntity<?> findPopularOfCources() {
        List<String> idList = null;
        List<Summary> popular = logService.findAllPopularCourse();
        if (popular != null) {
            idList = popular.parallelStream().map(new Function<Summary, String>() {
                @Override
                public String apply(Summary s) {
                    return s.getCourseId();
                }
            }).collect(Collectors.toList());
        }
        return ResponseEntity.ok(idList);
    }

    @PostMapping("/service/summary")
    public ResponseEntity<?> getSummaryOfCourses(@RequestBody String courseId) {
        return new ResponseEntity<>(logService.findSummaryByCourseId(courseId), HttpStatus.OK);
    }
}



















