package com.epicode.m5s1g5test.reservationService;

import com.epicode.m5s1g5test.data.User;
import com.epicode.m5s1g5test.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public User findById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }
}
