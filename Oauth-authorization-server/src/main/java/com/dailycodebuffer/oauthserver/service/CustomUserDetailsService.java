package com.dailycodebuffer.oauthserver.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.oauthserver.config.Role;

@Service
public class CustomUserDetailsService implements UserDetailsService {

//    @Autowired
//    private UserRepository userRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(11);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = new User();
//        if(user == null) {
//            throw  new UsernameNotFoundException("No User Found");
//        }
        return new org.springframework.security.core.userdetails.User(
                "john.doe@yopmail.com",
                "$2a$12$kieSTBolVWIpWKe7Vosg9u.mcxrfdQMKTTLQHJ18AZ4unUCVwsvgu",
                true,
                true,
                true,
                true,
                getAuthorities(List.of(Role.READ))
        );
    }

    private Collection<? extends GrantedAuthority> getAuthorities(List<String> roles) {
        List<GrantedAuthority>  authorities = new ArrayList<>();
        for(String role: roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }
}
