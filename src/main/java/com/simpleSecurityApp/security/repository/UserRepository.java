package com.simpleSecurityApp.security.repository;

import java.util.Optional;

import com.simpleSecurityApp.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Boolean existsByEmail(String username);
    Boolean existsByUsername(String email);

    Optional<User> findByEmailOrUsername(String email, String username);
}