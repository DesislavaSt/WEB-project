package com.example.notesincloud.service;

import com.example.notesincloud.model.entity.User;
import com.example.notesincloud.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        Optional<User> existingUser = userRepository.findById(user.getId());
        if (existingUser.isPresent()) {
            User u = existingUser.get();
            u.setUsername(user.getUsername());
            u.setEmail(user.getEmail());
            u.setPasswordHash(user.getPasswordHash());
            return userRepository.save(u);
        }
        return userRepository.save(user); // fallback
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
