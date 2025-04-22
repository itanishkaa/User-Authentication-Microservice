package com.userauth.userauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userauth.userauth.entity.User;

public interface AuthRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
