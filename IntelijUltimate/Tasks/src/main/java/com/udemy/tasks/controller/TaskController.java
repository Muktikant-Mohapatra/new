package com.udemy.tasks.controller;


import com.udemy.tasks.domain.Task;
import com.udemy.tasks.service.TaskService;
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
