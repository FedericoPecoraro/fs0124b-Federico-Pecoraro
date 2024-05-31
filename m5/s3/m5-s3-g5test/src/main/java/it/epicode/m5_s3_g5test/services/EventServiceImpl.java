package it.epicode.m5_s3_g5test.services;


import it.epicode.m5_s3_g5test.entities.Event;
import it.epicode.m5_s3_g5test.repositories.EventRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Slf4j
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventirep;
    @Override
    public List<Event> getEventi() {
        return eventirep.findAll();
    }

    @Override
    public Optional<Event> getEventi(Long id) {
        try {
            return eventirep.findById(id);
        }catch (Exception ex){
            log.error(String.format("evento con id = non trovato",id),ex);
            return Optional.empty();
        }
    }

    @Override
    public Event save(Event eventi) {
        try {
            return eventirep.save(eventi);
        }catch (Exception ex){
            log.error(String.format("salvataggio non riuscito di",eventi),ex);
            return null;
        }
    }

    @Override
    public Optional<Event> update(Long eventoId, Event eventi) {
        try{
            var eve = eventirep.findById(eventoId).orElseThrow();
            eve.builder()
                    .withData(eve.getData())
                    .withDescrizione(eve.getDescrizione())
                    .withPostiDisponibili(eve.getPostiDisponibili())
                    .withLuogo(eve.getLuogo())
                    .withPostiPrenotati(eve.getPostiPrenotati())
                    .withTitolo(eve.getTitolo())
                    .build();
            return Optional.of(eventirep.save(eve));
        }
        catch (NoSuchElementException ex){
            log.error(String.format("evento con id = %s non trovato", eventoId), ex);
        }
        return Optional.empty();
    }

    @Override
    public Optional<Event> delete(Long eventoId) {
        try{
            var dip = eventirep.findById(eventoId).orElseThrow();
            eventirep.delete(dip);
            return Optional.of(dip);
        }catch (NoSuchElementException ex){
            log.error(String.format("evento non trovato con id = %s",eventoId),ex);
            throw new RuntimeException("non trovo l'evento...");
        }catch (Exception ex){
            log.error(String.format("errore eliminazione evento con id = %s",eventoId),ex);
            throw new RuntimeException();
        }
    }

}