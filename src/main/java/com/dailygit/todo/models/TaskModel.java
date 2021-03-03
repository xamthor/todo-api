package com.dailygit.todo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Todo")
public class TaskModel {
    @Id
    public String id;

    private String content;

    public TaskModel(String content) {
        this.content = content;
    }

    public TaskModel() {
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
