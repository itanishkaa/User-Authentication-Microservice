package com.userauth.userauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.userauth.userauth.entity.User;
import com.userauth.userauth.repository.AuthRepository;

@Service
public class UserInfoConfigManager implements UserDetailsService {

    @Autowired
    private AuthRepository authRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = authRepository.findByUsername(username);
        if (user != null) {
            return org.springframework.security.core.userdetails.User.builder()
                        .username(user.getUsername())
                        .password(user.getPassword())
                        .roles(user.getRoles().toArray(new String[0]))
                        .build();
        }
        throw new UsernameNotFoundException("User not found with username: " + username);
    }
    
}
