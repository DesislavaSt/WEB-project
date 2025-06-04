package com.example.notesincloud.model.repository;

import com.example.notesincloud.model.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long>{
}
