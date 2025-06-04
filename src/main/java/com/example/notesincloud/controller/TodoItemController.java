package com.example.notesincloud.controller;

import com.example.notesincloud.model.entity.Note;
import com.example.notesincloud.model.entity.TodoItem;
import com.example.notesincloud.service.NoteService;
import com.example.notesincloud.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
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
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
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
        return ResponseEntity.noContent().build();
    }


}
