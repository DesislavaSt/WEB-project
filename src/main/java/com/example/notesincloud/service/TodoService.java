package com.example.notesincloud.service;

import com.example.notesincloud.model.entity.Todo;
import com.example.notesincloud.model.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo createTodo(Todo Todo) {
        return todoRepository.save(Todo);
    }

    public Todo updateTodo(Todo Todo) {
        Optional<Todo> existingTodo = todoRepository.findById(Todo.getId());
        if(existingTodo.isPresent()) {
            Todo Todo1 = existingTodo.get();
//            Todo1.setTitle(Todo.getTitle());
//            Todo1.setDescription(Todo.getDescription());
//            Todo1.setUserId(Todo.getUserId());
//            Todo1.setCreationDate(Todo.getCreationDate());
//            Todo1.setNotificationDate(Todo.getNotificationDate());
            return todoRepository.save(Todo1);
        }
        return todoRepository.save(Todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
