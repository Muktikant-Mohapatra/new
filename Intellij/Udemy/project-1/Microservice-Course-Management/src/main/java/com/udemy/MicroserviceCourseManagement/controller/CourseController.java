package com.udemy.MicroserviceCourseManagement.controller;

import com.udemy.MicroserviceCourseManagement.interCommunication.LogClient;
import com.udemy.MicroserviceCourseManagement.interCommunication.UserClient;
import com.udemy.MicroserviceCourseManagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

public class CourseController {
    @Autowired
    private LogClient logClient;
    @Autowired
    private UserClient userClient;
    @Autowired
    private CourseService courseService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private Environment env;

    @Value("${spring.application.name}")
    private String serviceId;

    @GetMapping("/service/port")
    public String getPort() {
        return "Service is working at port : " + env.getProperty("local.server.port");
    }

    @GetMapping("/service/instances")
    public ResponseEntity<?> getInstances() {
        return ResponseEntity.ok(discoveryClient.getInstances(serviceId));
    }

    @GetMapping("/popular")
    public ResponseEntity<?> popularCourses() {
        List<String> popularProductList = logClient.getPopularCourses();
        return new ResponseEntity<>(popularProductList, HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<?> getUsers() {
        List<String> list = Arrays.asList("id1", "id2", "id3");
        List<String> users = userClient.getUsers(list);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
