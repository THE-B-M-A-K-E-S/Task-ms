package com.thebmakes.taskms.repository;

import com.thebmakes.taskms.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {

    List<Task> findAllByProjectId(String projectId);
}
