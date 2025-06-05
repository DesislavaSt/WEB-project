package com.example.notesincloud.controller;

import com.example.notesincloud.model.entity.TodoItem;
import com.example.notesincloud.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
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
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
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
        return ResponseEntity.noContent().build();
    }
}
