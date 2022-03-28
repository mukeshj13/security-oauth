package com.dailycodebuffer.client.repository;

import org.springframework.stereotype.Repository;

import com.dailycodebuffer.client.entity.PasswordResetToken;

@Repository
public interface PasswordResetTokenRepository 
        {
    PasswordResetToken findByToken(String token);
}
