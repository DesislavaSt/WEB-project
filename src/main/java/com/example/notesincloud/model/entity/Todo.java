package com.example.notesincloud.model.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TODOS")
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    private String userId;

    @OneToMany
    @JoinColumn(name = "item_id")
    private List<TodoItem> todoItems;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public Todo() {
        this.createdAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<TodoItem> getTodoItems() {
        return todoItems;
    }

    public void setTodoItems(List<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }
}
