package com.dailygit.todo.Repository;

import com.dailygit.todo.models.TaskModel;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository extends MongoRepository<TaskModel, String> {
    public List< TaskModel > findAllByuserID(String userID, Sort sort);
}