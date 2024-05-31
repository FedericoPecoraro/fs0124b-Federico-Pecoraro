package it.epicode.m5_s3_g5test.controllers;

import it.epicode.m5_s3_g5test.entities.User;
import it.epicode.m5_s3_g5test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUtenti(){
        List<User> utenti = userService.getUtenti();
        return  ResponseEntity.ok(utenti);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUtenteById(@PathVariable Long id) {
        Optional<User> utente = userService.getUtente(id);
        return utente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUtente(@PathVariable Long id, @RequestBody User utente) {
        Optional<User> updatedUte = userService.update(id, utente);
        return updatedUte.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUtente(@PathVariable Long id) {
        Optional<User> deletedUte= userService.delete(id);
        if (deletedUte.isPresent()) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
