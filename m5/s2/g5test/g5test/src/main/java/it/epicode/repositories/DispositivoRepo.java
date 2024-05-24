package it.epicode.repositories;

import it.epicode.entities.Dipendente;
import it.epicode.entities.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface DispositivoRepo extends JpaRepository<Dispositivo, Long>, PagingAndSortingRepository<Dispositivo, Long> {
    List<Dipendente> getDipendenti();

    @Override
    Optional<Dispositivo> findById(Long aLong);
}
