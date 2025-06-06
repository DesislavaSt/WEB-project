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

<<<<<<< HEAD
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
=======
    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User User) {
        return userRepository.save(User);
    }

    public User updateUser(User User) {
        Optional<User> existingUser = userRepository.findById(User.getId());
        if(existingUser.isPresent()) {
            User User1 = existingUser.get();
//            User1.setTitle(User.getTitle());
//            User1.setDescription(User.getDescription());
//            User1.setUserId(User.getUserId());
//            User1.setCreationDate(User.getCreationDate());
//            User1.setNotificationDate(User.getNotificationDate());
            return userRepository.save(User1);
        }
        return userRepository.save(User);
>>>>>>> ce1071fced416668e38e835d5636363e689407cc
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
