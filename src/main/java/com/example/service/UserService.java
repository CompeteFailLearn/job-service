package com.example.service;

import com.example.dao.UserRepo;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public void addUser(User user){
        repo.save(user);
    }

    public List<User> getAllUsers(User user) {
        return repo.findAll();
    }
}
