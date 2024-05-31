package it.epicode.m5_s3_g5test.services;

import it.epicode.m5_s3_g5test.dto.LoggedUserDto;
import it.epicode.m5_s3_g5test.dto.LoginResponseDto;
import it.epicode.m5_s3_g5test.dto.RegisterUserDto;
import it.epicode.m5_s3_g5test.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUtenti();

    Optional<User> getUtente(Long id);

    User save(User user);

    Optional<User> update(Long utenteId, User utente);

    Optional<User> delete(Long utenteId);

     LoggedUserDto register(RegisterUserDto user);

    Optional<LoginResponseDto> login(String username, String password);

    Optional<LoggedUserDto> get(long id);
}
