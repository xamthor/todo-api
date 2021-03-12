package com.dailygit.todo.controllers;

import com.dailygit.todo.Repository.TaskRepository;
import com.dailygit.todo.models.TaskModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "*")
public class TaskController {

    @Autowired
    public TaskRepository taskRepository;

    @GetMapping("all")
    public List<TaskModel> Index(@RequestParam String userID) {
        Sort sort = Sort.by("timestamp").descending();

        return taskRepository.findAllByuserID(userID, sort);
    }

    @PostMapping("create")
    public TaskModel Create(@RequestBody TaskModel data) {

        TaskModel newTask = new TaskModel(data.getTitle(), data.getContent(), data.getUserID());

        taskRepository.save(newTask);

        return newTask;

    }

    @GetMapping("id")
    public Optional<TaskModel> id(@RequestParam String id) {
        return taskRepository.findById(id);
    }

    @PostMapping("update")
    public String Update(@RequestBody TaskModel data) {

        taskRepository.save(data);

        return "Task Updated";
    }

    @DeleteMapping("delete")
    public String Delete(@RequestBody TaskModel data) {

        taskRepository.deleteById(data.getId());

        return "Task Deleted";
    }

}


