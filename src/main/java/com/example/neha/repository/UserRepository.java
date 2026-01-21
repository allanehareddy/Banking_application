package com.example.neha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.neha.entity.user;
public interface UserRepository extends JpaRepository<user,Long> {
    Boolean existsByEmail(String email);

}
