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

    public List<TodoItem> getAllItems() {
        return todoItemRepository.findAll();
    }

    public Optional<TodoItem> getById(Long id) {
        return todoItemRepository.findById(id);
    }

    public TodoItem createItem(TodoItem item) {
        return todoItemRepository.save(item);
    }

    public TodoItem updateItem(TodoItem item) {
        Optional<TodoItem> existingItem = todoItemRepository.findById(item.getId());
        if (existingItem.isPresent()) {
            TodoItem itemToUpdate = existingItem.get();
            itemToUpdate.setText(item.getText());
            itemToUpdate.setCompleted(item.getCompleted());
            itemToUpdate.setTodo(item.getTodo());
            return todoItemRepository.save(itemToUpdate);
        }
        return todoItemRepository.save(item); // fallback
    }

    public void deleteItem(Long id) {
        todoItemRepository.deleteById(id);
    }
}
