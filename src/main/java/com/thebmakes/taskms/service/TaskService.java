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
    public Task findById(String id) {
        return taskRepository.findById(id).get();
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public Task update(Task task) {
        return taskRepository.save(task);
    }

    public void delete(String id) {
        taskRepository.deleteById(id);
    }

    public List<Task> findAllByProjectId(String projectId) {
        return taskRepository.findAllByProjectId(projectId);
    }
}
