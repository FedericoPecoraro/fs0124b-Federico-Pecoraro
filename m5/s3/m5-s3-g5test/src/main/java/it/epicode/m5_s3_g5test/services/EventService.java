package it.epicode.m5_s3_g5test.services;

import it.epicode.m5_s3_g5test.entities.Event;
import java.util.List;
import java.util.Optional;

public interface EventService {
    List<Event> getEventi();
    Optional<Event> getEventi(Long id);
    Event save(Event eventi);
    Optional<Event> update(Long eventoId, Event eventi);
    Optional<Event> delete(Long eventoId);
}
