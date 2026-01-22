package com.example.neha.service;

import com.example.neha.dto.BankResponse;
import com.example.neha.dto.UserRequest;

public interface UserService {
     BankResponse createAccount(UserRequest userRequest);
}
