package it.epicode.g5test.services;

import it.epicode.g5test.entities.Dipendente;
import java.util.List;
import java.util.Optional;

public interface DipendenteService {
    List<Dipendente> getDipendenti();
    Optional<Dipendente> getDipendente(Long id);
    Dipendente save(Long dipendenteId, Dipendente dipendente);
    Dipendente delete(Long dipendenteId);
}
