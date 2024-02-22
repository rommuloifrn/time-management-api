package com.romm.timemanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romm.timemanagement.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired UserService service;

    @GetMapping("/count")
    public Long userCount() {
        return service.getUserCount();
    }
}
