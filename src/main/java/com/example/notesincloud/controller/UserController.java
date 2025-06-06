package com.example.notesincloud.controller;

<<<<<<< HEAD
import com.example.notesincloud.model.entity.User;
=======
import com.example.notesincloud.model.entity.Note;
import com.example.notesincloud.model.entity.User;
import com.example.notesincloud.service.NoteService;
>>>>>>> ce1071fced416668e38e835d5636363e689407cc
import com.example.notesincloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
<<<<<<< HEAD
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = userService.getUserById(id);
        return user.map(ResponseEntity::ok)
=======
    public ResponseEntity<List<User>> getAllNotes() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<User> getNoteById(@PathVariable Long id) {
        Optional<User> note = userService.getById(id);
        return note.map(ResponseEntity::ok)
>>>>>>> ce1071fced416668e38e835d5636363e689407cc
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @DeleteMapping("/{id}")
<<<<<<< HEAD
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
=======
    public ResponseEntity<Void> deleteNote(@PathVariable Long id) {
>>>>>>> ce1071fced416668e38e835d5636363e689407cc
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
