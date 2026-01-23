package com.example.neha.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AccountInfo {
    private String accountName;
    private String accountNumber;

    private BigDecimal accountBalance;

}
