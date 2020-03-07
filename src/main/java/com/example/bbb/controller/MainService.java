package com.example.bbb.controller;

import com.example.bbb.dao.UserRepository;
import com.example.bbb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service

public class MainService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    public List<User> findByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }

    public List<User> findByUsernameAndPassword(String username,String password)
    {
        return userRepository.findByUsernameAndPassword(username,password);
    }

    public boolean add(String username,String password) {
        List<User> findUserName = userRepository.findByUsername(username);
        if (findUserName.size() != 0) {
            return false;
        } else {
            if (username.length() > 20 || username.length() == 0 || password.length() > 20 || password.length() == 0) {
                return false;
            } else {
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                userRepository.save(user);
                return true;
            }
        }
    }
}

