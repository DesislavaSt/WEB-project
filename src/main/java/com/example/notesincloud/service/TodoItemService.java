package com.example.notesincloud.service;


import com.example.notesincloud.model.entity.TodoItem;
import com.example.notesincloud.model.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoItemService {
    @Autowired
    private TodoItemRepository todoItemRepository;

    public List<TodoItem> getAllTodoItems() {
        return todoItemRepository.findAll();
    }

    public Optional<TodoItem> getById(Long id) {
        return todoItemRepository.findById(id);
    }

    public TodoItem createTodoItem(TodoItem TodoItem) {
        return todoItemRepository.save(TodoItem);
    }

    public TodoItem updateTodoItem(TodoItem TodoItem) {
        Optional<TodoItem> existingTodoItem = todoItemRepository.findById(TodoItem.getId());
        if(existingTodoItem.isPresent()) {
            TodoItem TodoItem1 = existingTodoItem.get();
//            TodoItem1.setTitle(TodoItem.getTitle());
//            TodoItem1.setDescription(TodoItem.getDescription());
//            TodoItem1.setUserId(TodoItem.getUserId());
//            TodoItem1.setCreationDate(TodoItem.getCreationDate());
//            TodoItem1.setNotificationDate(TodoItem.getNotificationDate());
            return todoItemRepository.save(TodoItem1);
        }
        return todoItemRepository.save(TodoItem);
    }

    public void deleteTodoItem(Long id) {
        todoItemRepository.deleteById(id);
    }
}