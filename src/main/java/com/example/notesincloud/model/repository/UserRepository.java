package com.example.notesincloud.model.repository;

import com.example.notesincloud.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
public interface UserRepository extends JpaRepository<User,Long> {
}
