package it.epicode.services;

import it.epicode.entities.Dispositivo;

import java.util.List;
import java.util.Optional;

public interface DispositivoService {
    List<Dispositivo> getDispositivi();
    Optional<Dispositivo> getDispositivo(Long id);
    Dispositivo save(Dispositivo dispositivo);
    Optional<Dispositivo> update(Long dispositivoId, Dispositivo dispositivo);
    Optional<Dispositivo> delete(Long dispositivoId);
    Dispositivo assign(Long dispositivoId, Long dipendenteId);
    Dispositivo removeAssignedDevice(Long dispositivoId, Long dipendenteId);
}
