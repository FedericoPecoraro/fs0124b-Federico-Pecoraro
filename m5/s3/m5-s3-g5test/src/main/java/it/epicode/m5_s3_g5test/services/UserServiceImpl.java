package it.epicode.m5_s3_g5test.services;


import it.epicode.m5_s3_g5test.Mapper;
import it.epicode.m5_s3_g5test.dto.LoggedUserDto;
import it.epicode.m5_s3_g5test.dto.LoginResponseDto;
import it.epicode.m5_s3_g5test.dto.RegisterUserDto;
import it.epicode.m5_s3_g5test.entities.RoleEntity;
import it.epicode.m5_s3_g5test.entities.User;
import it.epicode.m5_s3_g5test.exceptions.PersistEntityException;
import it.epicode.m5_s3_g5test.repositories.RoleRepository;
import it.epicode.m5_s3_g5test.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository utenti;
    @Autowired
    RoleRepository ruoloRep;
    @Autowired
    private AuthenticationManager auth;
    @Autowired
    PasswordEncoder encoder;
    @Autowired
    Mapper<RegisterUserDto, User> mapEntity;
    @Autowired
    Mapper<User, LoggedUserDto> mapRegisteredUser;
    @Autowired
    Mapper<User, LoginResponseDto> mapLogin;

    @Override
    public List<User> getUtenti() {
        return utenti.findAll();
    }

    @Override
    public Optional<User> getUtente(Long id) {
        try {
            return utenti.findById(id);
        }catch (Exception ex){
            log.error(String.format("utente con id = non trovato",id),ex);
            return Optional.empty();
        }
    }

    @Override
    public User save(User utente) {
        try {
            return utenti.save(utente);
        }catch (Exception ex){
            log.error(String.format("salvataggio non riuscito di",utente),ex);
            return null;
        }
    }

    @Override
    public Optional<User> update(Long utenteId, User utente) {
        try{
            var ute = utenti.findById(utenteId).orElseThrow();
            ute.builder()
                    .withNome(ute.getNome())
                    .withEmail(ute.getEmail())
                    .withPassword(ute.getPassword())
                    .build();
            return Optional.of(utenti.save(ute));
        }
        catch (NoSuchElementException ex){
            log.error(String.format("utente con id = %s non trovato", utenteId), ex);
        }
        return Optional.empty();

    }

    @Override
    public Optional<User> delete(Long utenteId) {
        try{
            var ute = utenti.findById(utenteId).orElseThrow();
            utenti.delete(ute);
            return Optional.of(ute);
        }catch (NoSuchElementException ex){
            log.error(String.format("utente non trovato con id = %s",utenteId),ex);
            throw new RuntimeException("non trovo l'utente...");
        }catch (Exception ex){
            log.error(String.format("errore eliminazione utente con id = %s",utenteId),ex);
            throw new RuntimeException();
        }
    }

    @Override
    public LoggedUserDto register( RegisterUserDto user) {
        try {
            var u = mapEntity.map(user);
            var p = encoder.encode(user.getPassword());
            log.info("Password encrypted: {}", p);
            u.setPassword(p);
            if (user.getRoles() != null)
                Stream.of(user.getRoles().split(",")).forEach(r -> u.getRoles().add(ruoloRep.findOneByName(r) //
                        .orElse(ruoloRep.save(RoleEntity.builder().withNome(r).build()))));
            return mapRegisteredUser.map(utenti.save(u));
        } catch (Exception e) {
            log.error(String.format("Exception saving user %s", user), e);
            throw new PersistEntityException(user);
        }
    }
    @Override
    public Optional<LoginResponseDto> login(String username, String password) {
        return Optional.empty();
    }

    @Override
    public Optional<LoggedUserDto> get(long id) {
        return Optional.empty();
    }

}