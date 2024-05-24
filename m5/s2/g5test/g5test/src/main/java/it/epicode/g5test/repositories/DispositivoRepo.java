package it.epicode.g5test.repositories;

import it.epicode.g5test.entities.Dipendente;
import it.epicode.g5test.entities.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;
import java.util.Optional;

public interface DispositivoRepo extends JpaRepository<Dispositivo, Long>, PagingAndSortingRepository<Dispositivo, Long> {
    List<Dipendente> getDipendenti();

    @Override
    Optional<Dispositivo> findById(Long aLong);
}
