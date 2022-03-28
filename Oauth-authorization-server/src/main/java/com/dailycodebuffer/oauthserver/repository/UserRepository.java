package com.dailycodebuffer.oauthserver.repository;


import com.dailycodebuffer.oauthserver.entity.User;

//@Repository
public interface UserRepository /*extends JpaRepository<User,Long>*/ {
    User findByEmail(String email);
}
