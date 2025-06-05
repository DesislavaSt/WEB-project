package com.example.notesincloud.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String text;

    @Column
    private Boolean completed;

    //new
    @ManyToOne
    @JoinColumn(name = "todo_id")  // Връзка с Todo (много item-и към 1 todo)
    private Todo todo;
    //new

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

    public Todo getTodo() {
        return todo;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
    }
}
