package it.epicode.repositories;

import it.epicode.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendenteRepo extends JpaRepository<Dipendente, Long>, PagingAndSortingRepository<Dipendente, Long> {
}
