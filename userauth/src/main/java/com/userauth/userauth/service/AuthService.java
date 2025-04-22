package com.userauth.userauth.service;

import com.userauth.userauth.dto.RegisterDTO;
import com.userauth.userauth.dto.RegisterResponse;

public interface AuthService {
    RegisterResponse register(RegisterDTO registerDTO);
}
