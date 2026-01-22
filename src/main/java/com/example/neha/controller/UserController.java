package com.example.neha.controller;


import com.example.neha.dto.BankResponse;
import com.example.neha.dto.UserRequest;
import com.example.neha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userservice;
    @PostMapping
    public BankResponse createdUser(@RequestBody UserRequest userRequest){
        return userservice.createAccount(userRequest);
    }

}
