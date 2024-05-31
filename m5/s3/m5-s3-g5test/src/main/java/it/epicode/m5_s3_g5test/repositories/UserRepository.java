package it.epicode.m5_s3_g5test.repositories;

import it.epicode.m5_s3_g5test.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    Optional<UserEntity> findOneByNameAndPassword(String nome, String password);
    Optional<UserEntity> findOneByName(String nome);
}
