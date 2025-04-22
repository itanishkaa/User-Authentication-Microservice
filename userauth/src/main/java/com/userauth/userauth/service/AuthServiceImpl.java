package com.userauth.userauth.service;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.userauth.userauth.dto.RegisterDTO;
import com.userauth.userauth.dto.RegisterResponse;
import com.userauth.userauth.entity.User;
import com.userauth.userauth.repository.AuthRepository;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthRepository authRepository;

    @Autowired
    private ModelMapper modelMapper;

    private static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    @Override
    public RegisterResponse register(RegisterDTO registerDTO) {
        User user = modelMapper.map(registerDTO, User.class);
        user.setPassword(PASSWORD_ENCODER.encode(registerDTO.getPassword()));
        user.setCreatedAt(LocalDateTime.now());
        user.setRoles(Arrays.asList("USER"));
        User save = authRepository.save(user);
        return modelMapper.map(save, RegisterResponse.class);
    }
}
