package it.epicode.m5_s3_g5test.repositories;

import it.epicode.m5_s3_g5test.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findOneByUsernameAndPassword(String username, String password);
    Optional<User> findOneByUsername(String username);
}
