package com.simpleSecurityApp.security.repository;

import java.util.Optional;

import com.simpleSecurityApp.security.model.Role;
import com.simpleSecurityApp.security.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}