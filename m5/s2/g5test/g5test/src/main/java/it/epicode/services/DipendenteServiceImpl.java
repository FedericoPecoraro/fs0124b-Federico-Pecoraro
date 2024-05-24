package it.epicode.services;

import it.epicode.entities.Dipendente;
import it.epicode.repositories.DipendenteRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Slf4j
public class DipendenteServiceImpl implements DipendenteService {

    @Autowired
    DipendenteRepo dipendenti;

    @Override
    public List<Dipendente> getDipendenti() {
        return dipendenti.findAll();
    }

    @Override
    public Optional<Dipendente> getDipendente(Long id) {
        try {
            return dipendenti.findById(id);
        }
        catch (Exception e) {
            log.error(String.format("Nessun dipendente trovato con questo Id"));
            return Optional.empty();
        }
    }

    @Override
    public Dipendente save(Dipendente dipendente) {
        try {
            return dipendenti.save(dipendente);
        }
        catch (Exception e){
            log.error(String.format("Salvataggio del dipendente non riuscito"));
            return null;
        }
    }

    @Override
    public Optional<Dipendente> update(Long dipendenteId, Dipendente dipendente) {
        try {
            var d = dipendenti.findById(dipendenteId).orElseThrow();
            d.builder()
                    .withNome(d.getNome())
                    .withCognome(d.getCognome())
                    .withNomeUtente(d.getNomeUtente())
                    .withEmail(d.getEmail())
                    .withDispositivi(d.getDispositivi())
                    .build();
            return Optional.of(dipendenti.save(d));
        }
        catch (NoSuchElementException e){
            log.error(String.format("Nessun dipendente trovato con questo Id"));
        }
        return Optional.empty();
    }

    @Override
    public Optional<Dipendente> delete(Long dipendenteId) {
        try {
            var d = dipendenti.findById(dipendenteId).orElseThrow();
            dipendenti.delete(d);
            return Optional.of(d);
        }catch (NoSuchElementException ex){
            log.error(String.format("dipendente non trovato con id = %s",dipendenteId),ex);
            throw new RuntimeException("Nessun dipendente trovato con questo Id");
        }catch (Exception ex){
            log.error(String.format("errore nell'eliminazione del dipendente con id = %s",dipendenteId),ex);
            throw new RuntimeException();
        }
    }
}
