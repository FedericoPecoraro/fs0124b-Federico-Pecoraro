package com.epicode.m5s1g5test.repository;

import com.epicode.m5s1g5test.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findById(long id);
}
