package it.epicode.g5test.repositories;

import it.epicode.g5test.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DipendenteRepo extends JpaRepository<Dipendente, Long>, PagingAndSortingRepository<Dipendente, Long> {
}
