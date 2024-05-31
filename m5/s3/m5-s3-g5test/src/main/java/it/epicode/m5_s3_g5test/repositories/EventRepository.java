package it.epicode.m5_s3_g5test.repositories;

import it.epicode.m5_s3_g5test.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
