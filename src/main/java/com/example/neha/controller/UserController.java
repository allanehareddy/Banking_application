package com.example.neha.controller;


import com.example.neha.dto.BankResponse;
import com.example.neha.dto.CreditDebitRequest;
import com.example.neha.dto.TransferRequest;
import com.example.neha.dto.UserRequest;
import com.example.neha.service.EnquiryRequest;
import com.example.neha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userservice;
    @PostMapping("/register")
    public BankResponse createdUser(@RequestBody UserRequest userRequest){
        return userservice.createAccount(userRequest);
    }
    @GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return userservice.balanceEnquiry(request);
    }
    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userservice.nameEnquiry(request);
    }
    @PostMapping("credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userservice.creditAccount(request);
    }
    @PostMapping("debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userservice.debitAccount(request);
    }
    @PostMapping("transfer")
    public BankResponse transfer(@RequestBody TransferRequest request){
        return userservice.Transfer(request);
    }
}
