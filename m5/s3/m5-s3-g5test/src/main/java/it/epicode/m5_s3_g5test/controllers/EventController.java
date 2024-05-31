package it.epicode.m5_s3_g5test.controllers;

import it.epicode.m5_s3_g5test.entities.Event;
import it.epicode.m5_s3_g5test.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventiService;

    @GetMapping
    public ResponseEntity<List<Event>> getAllEventi(){
        List<Event> eventi = eventiService.getEventi();
        return  ResponseEntity.ok(eventi);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Event> getEventoById(@PathVariable Long id) {
        Optional<Event> eventi = eventiService.getEventi(id);
        return eventi.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<Event> createEvento(@RequestBody Event evento) {
        Event savedEventi = eventiService.save(evento);
        if (savedEventi != null) {
            return ResponseEntity.ok(savedEventi);
        } else {
            return ResponseEntity.status(500).build();
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Event> updateEvento(@PathVariable Long id, @RequestBody Event evento) {
        Optional<Event> updatedEve = eventiService.update(id, evento);
        return updatedEve.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEventi(@PathVariable Long id) {
        Optional<Event> deletedEve= eventiService.delete(id);
        if (deletedEve.isPresent()) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
