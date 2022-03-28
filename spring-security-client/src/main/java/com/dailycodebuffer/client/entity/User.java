package com.dailycodebuffer.client.entity;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private String password;

    private String role;
    private boolean enabled = false;
}
