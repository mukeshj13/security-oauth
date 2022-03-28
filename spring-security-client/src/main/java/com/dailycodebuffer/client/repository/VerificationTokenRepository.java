package com.dailycodebuffer.client.repository;

import org.springframework.stereotype.Repository;

import com.dailycodebuffer.client.entity.VerificationToken;

@Repository
public interface VerificationTokenRepository {
    VerificationToken findByToken(String token);
}
