package com.simpleSecurityApp.security.controller;

import com.simpleSecurityApp.security.model.User;
import com.simpleSecurityApp.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/")
public class UserRestController {

    @Autowired
    UserService userService;

    @GetMapping("UserService/getByEmail/{email}")
    public User getByEmail(@PathVariable String email){
        return userService.getByEmail(email);
    }


}
