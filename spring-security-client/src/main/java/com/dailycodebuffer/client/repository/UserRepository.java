package com.dailycodebuffer.client.repository;

import org.springframework.stereotype.Repository;

import com.dailycodebuffer.client.entity.User;

@Repository
public interface UserRepository {
    User findByEmail(String email);
}
