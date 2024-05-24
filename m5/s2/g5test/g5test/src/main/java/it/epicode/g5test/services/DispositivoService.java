package it.epicode.g5test.services;

import it.epicode.g5test.entities.Dispositivo;
import java.util.List;
import java.util.Optional;

public interface DispositivoService {
    List<Dispositivo> getDispositivi();
    Optional<Dispositivo> getDispositivo(Long id);
    Dispositivo save(Dispositivo dispositivo);
    Dispositivo update(Long dispositivoId, Dispositivo dispositivo);
    Dispositivo delete(Long dispositivoId);
    Dispositivo assign(Long dispositivoId, Long dipendenteId);
}
