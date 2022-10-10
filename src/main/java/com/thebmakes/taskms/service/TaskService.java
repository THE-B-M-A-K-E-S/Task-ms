package com.thebmakes.taskms.service;

import com.thebmakes.taskms.entity.Task;
import com.thebmakes.taskms.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }
}
