package com.dailycodebuffer.oauthserver.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private String password;

    private String role;
    private boolean enabled = false;
    
    
}
