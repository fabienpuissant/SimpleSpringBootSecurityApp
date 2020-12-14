package com.simpleSecurityApp.security.service;

import com.simpleSecurityApp.security.model.User;
import com.simpleSecurityApp.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User getByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }
}
