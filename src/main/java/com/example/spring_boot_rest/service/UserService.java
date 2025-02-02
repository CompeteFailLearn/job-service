package com.example.spring_boot_rest.service;

import com.example.spring_boot_rest.dao.UserRepo;
import com.example.spring_boot_rest.model.User;
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
