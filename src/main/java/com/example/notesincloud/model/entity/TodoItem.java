package com.example.notesincloud.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class TodoItem {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String text;

    @Column
    private Boolean completed;

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}