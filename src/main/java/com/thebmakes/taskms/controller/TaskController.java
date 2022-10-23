package com.thebmakes.taskms.controller;

import com.thebmakes.taskms.entity.Task;
import com.thebmakes.taskms.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("")
    public List<Task> findAll() {
        return taskService.findAll();
    }

    @GetMapping("{id}")
    public Task findById(@PathVariable String id) {
        return taskService.findById(id);
    }

    @PostMapping("")
    public Task save(@RequestBody Task task) {
        return taskService.save(task);
    }

    @PutMapping("")
    public Task update(@RequestBody Task task) {
        return taskService.update(task);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        taskService.delete(id);
    }
}
