package com.example.notesincloud.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String text;

    @Column
    private Boolean completed;
}