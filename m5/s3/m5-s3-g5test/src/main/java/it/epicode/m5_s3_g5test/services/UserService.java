package it.epicode.m5_s3_g5test.services;

import it.epicode.m5_s3_g5test.entities.UserEntity;
import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserEntity> getUtenti();
    Optional<UserEntity> getUtente(Long id);
    UserEntity save(UserEntity utente);
    Optional<UserEntity> update(Long utenteId, UserEntity utente);
    Optional<UserEntity> delete(Long utenteId);
}
