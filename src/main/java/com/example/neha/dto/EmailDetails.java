package com.example.neha.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="users")
public class EmailDetails {
    private String recipient;
    private String messageBody;
    private String subject;
    private String attachment;

}
