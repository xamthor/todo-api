package com.dailygit.todo.Repository;

import com.dailygit.todo.models.TaskModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<TaskModel, String> {

}