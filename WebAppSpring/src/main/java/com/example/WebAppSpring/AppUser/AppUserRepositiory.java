package com.example.WebAppSpring.AppUser;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional()
public interface AppUserRepositiory {
    Optional<User> findByEmail(String email);
}
