package com.example.notesincloud.controller;

<<<<<<< HEAD
import com.example.notesincloud.model.entity.TodoItem;
=======
import com.example.notesincloud.model.entity.Note;
import com.example.notesincloud.model.entity.TodoItem;
import com.example.notesincloud.service.NoteService;
>>>>>>> ce1071fced416668e38e835d5636363e689407cc
import com.example.notesincloud.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
<<<<<<< HEAD
@RequestMapping("/api/items")
public class TodoItemController {

    @Autowired
    private TodoItemService todoItemService;

    @GetMapping
    public ResponseEntity<List<TodoItem>> getAllItems() {
        return ResponseEntity.ok(todoItemService.getAllItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoItem> getItemById(@PathVariable Long id) {
        Optional<TodoItem> item = todoItemService.getById(id);
        return item.map(ResponseEntity::ok)
=======
@RequestMapping("/api/todoItems")
public class TodoItemController {

    @Autowired
    private TodoItemService noteService;
    @Autowired
    private TodoItemService todoItemService;

    @GetMapping
    public ResponseEntity<List<TodoItem>> getAllTodoItems() {
        return ResponseEntity.ok(todoItemService.getAllTodoItems());
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<TodoItem> getTodoItemById(@PathVariable Long id) {
        Optional<TodoItem> note = todoItemService.getById(id);
        return note.map(ResponseEntity::ok)
>>>>>>> ce1071fced416668e38e835d5636363e689407cc
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
<<<<<<< HEAD
    public ResponseEntity<TodoItem> createItem(@RequestBody TodoItem item) {
        return ResponseEntity.ok(todoItemService.createItem(item));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoItem> updateItem(@PathVariable Long id, @RequestBody TodoItem item) {
        item.setId(id);
        return ResponseEntity.ok(todoItemService.updateItem(item));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        todoItemService.deleteItem(id);
=======
    public ResponseEntity<TodoItem> createTodoItem(@RequestBody TodoItem todoItem) {
        return ResponseEntity.ok(todoItemService.createTodoItem(todoItem));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoItem> updateTodoItem(@PathVariable Long id, @RequestBody TodoItem todoItem) {
        todoItem.setId(id);
        return ResponseEntity.ok(noteService.updateTodoItem(todoItem));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoItem(@PathVariable Long id) {
        noteService.deleteTodoItem(id);
>>>>>>> ce1071fced416668e38e835d5636363e689407cc
        return ResponseEntity.noContent().build();
    }
}
