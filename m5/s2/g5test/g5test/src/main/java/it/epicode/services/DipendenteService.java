package it.epicode.services;

import it.epicode.entities.Dipendente;

import java.util.List;
import java.util.Optional;

public interface DipendenteService {
    List<Dipendente> getDipendenti();
    Optional<Dipendente> getDipendente(Long id);
    Dipendente save(Dipendente dipendente);
    Optional<Dipendente> update(Long dipendenteId, Dipendente dipendente);
    Optional<Dipendente> delete(Long dipendenteId);
}
