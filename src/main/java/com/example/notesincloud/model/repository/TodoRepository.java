package com.example.notesincloud.model.repository;

import com.example.notesincloud.model.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
public interface TodoRepository extends JpaRepository<Todo,Long > {
}
