package com.udemy.tasks.service;


import com.udemy.tasks.domain.Task;

public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
