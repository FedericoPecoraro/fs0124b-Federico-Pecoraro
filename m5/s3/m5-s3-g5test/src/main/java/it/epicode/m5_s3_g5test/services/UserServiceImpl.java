package it.epicode.m5_s3_g5test.services;

import it.epicode.m5_s3_g5test.entities.UserEntity;
import it.epicode.m5_s3_g5test.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository users;


    @Override
    public List<UserEntity> getUtenti() {
        return users.findAll();
    }

    @Override
    public Optional<UserEntity> getUtente(Long id) {
        try {
            return users.findById(id);
        }catch (Exception ex){
            log.error(String.format("utente con id = non trovato",id),ex);
            return Optional.empty();
        }
    }

    @Override
    public UserEntity save(UserEntity utente) {
        try {
            return users.save(utente);
        }catch (Exception ex){
            log.error(String.format("salvataggio non riuscito di",utente),ex);
            return null;
        }
    }

    @Override
    public Optional<UserEntity> update(Long utenteId, UserEntity utente) {
        try{
            var ute = users.findById(utenteId).orElseThrow();
            ute.builder()
                    .withNome(ute.getNome())
                    .withEmail(ute.getEmail())
                    .withPassword(ute.getPassword())
                    .build();
            return Optional.of(users.save(ute));
        }
        catch (NoSuchElementException ex){
            log.error(String.format("utente con id = %s non trovato", utenteId), ex);
        }
        return Optional.empty();
    }

    @Override
    public Optional<UserEntity> delete(Long utenteId) {
        try{
            var ute = users.findById(utenteId).orElseThrow();
            users.delete(ute);
            return Optional.of(ute);
        }catch (NoSuchElementException ex){
            log.error(String.format("utente non trovato con id = %s",utenteId),ex);
            throw new RuntimeException("non trovo l'utente...");
        }catch (Exception ex){
            log.error(String.format("errore eliminazione utente con id = %s",utenteId),ex);
            throw new RuntimeException();
    }
    }
}