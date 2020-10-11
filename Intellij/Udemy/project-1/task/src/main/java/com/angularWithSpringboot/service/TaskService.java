package com.angularWithSpringboot.service;

import com.angularWithSpringboot.domain.Task;

public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
