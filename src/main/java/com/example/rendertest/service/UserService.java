package com.example.rendertest.service;

import com.example.rendertest.mode.User;
import com.example.rendertest.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers () {
        return userRepo.findAll();
    }

    public User addUser (User user) {
        return userRepo.save(user);
    }

    public User updateUser (User user) {
        return userRepo.save(user);
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
