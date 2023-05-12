package com.example.rendertest.repo;

import com.example.rendertest.mode.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
