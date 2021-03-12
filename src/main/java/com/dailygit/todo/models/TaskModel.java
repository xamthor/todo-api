package com.dailygit.todo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("Todo")
public class TaskModel {
    @Id
    public String id;

    private String title;

    private String content;

    private String userID;

    private Date timestamp = new Date();

    public TaskModel(String title, String content, String userID) {
        this.title = title;
        this.content = content;
        this.userID = userID;
    }
    public TaskModel(String userID) {
        this.userID = userID;
    }
    public TaskModel() {
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getTitle() {
        return title;
    }
    public String getUserID() {
        return userID;
    }
}
