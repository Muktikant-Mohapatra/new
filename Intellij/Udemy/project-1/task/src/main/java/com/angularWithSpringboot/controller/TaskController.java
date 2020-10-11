package com.angularWithSpringboot.controller;

import com.angularWithSpringboot.domain.Task;
import com.angularWithSpringboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    /*@Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }*/

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list() {
        return this.taskService.list();
    }
    @PostMapping(value = "/save")
    public Task save(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
