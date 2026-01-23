package com.example.neha.service;

import com.example.neha.dto.BankResponse;
import com.example.neha.dto.CreditDebitRequest;
import com.example.neha.dto.UserRequest;

public interface UserService {
     BankResponse createAccount(UserRequest userRequest);
     BankResponse balanceEnquiry(EnquiryRequest request);
     String nameEnquiry(EnquiryRequest request);

     BankResponse creditAccount(CreditDebitRequest request);
}
