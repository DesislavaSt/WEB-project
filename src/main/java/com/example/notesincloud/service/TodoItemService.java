package com.example.notesincloud.service;

<<<<<<< HEAD
=======

>>>>>>> ce1071fced416668e38e835d5636363e689407cc
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

<<<<<<< HEAD
    public List<TodoItem> getAllItems() {
=======
    public List<TodoItem> getAllTodoItems() {
>>>>>>> ce1071fced416668e38e835d5636363e689407cc
        return todoItemRepository.findAll();
    }

    public Optional<TodoItem> getById(Long id) {
        return todoItemRepository.findById(id);
    }

<<<<<<< HEAD
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
=======
    public TodoItem createTodoItem(TodoItem todoItem) {
        return todoItemRepository.save(todoItem);
    }

    public TodoItem updateTodoItem(TodoItem todoItem) {
        Optional<TodoItem> existingTodoItem = todoItemRepository.findById(todoItem.getId());
        if(existingTodoItem.isPresent()) {
            TodoItem TodoItem1 = existingTodoItem.get();
//            TodoItem1.setTitle(TodoItem.getTitle());
//            TodoItem1.setDescription(TodoItem.getDescription());
//            TodoItem1.setUserId(TodoItem.getUserId());
//            TodoItem1.setCreationDate(TodoItem.getCreationDate());
//            TodoItem1.setNotificationDate(TodoItem.getNotificationDate());
            return todoItemRepository.save(TodoItem1);
        }
        return todoItemRepository.save(todoItem);
    }

    public void deleteTodoItem(Long id) {
>>>>>>> ce1071fced416668e38e835d5636363e689407cc
        todoItemRepository.deleteById(id);
    }
}
