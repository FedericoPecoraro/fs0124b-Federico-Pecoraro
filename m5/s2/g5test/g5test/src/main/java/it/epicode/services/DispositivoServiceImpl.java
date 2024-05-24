package it.epicode.services;

import it.epicode.entities.Dispositivo;
import it.epicode.entities.StatoDispositivo;
import it.epicode.repositories.DipendenteRepo;
import it.epicode.repositories.DispositivoRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Slf4j
public class DispositivoServiceImpl implements DispositivoService{
    @Autowired
    DispositivoRepo dispositivi;
    @Autowired
    DipendenteRepo dipendenti;

    @Override
    public List<Dispositivo> getDispositivi() {
        return dispositivi.findAll();
    }

    @Override
    public Optional<Dispositivo> getDispositivo(Long id) {
        try {
            return dispositivi.findById(id);
        }
        catch (Exception e) {
            log.error(String.format("dispotivo con id = non trovato",id),e);
            return Optional.empty();
        }
    }

    @Override
    public Dispositivo save(Dispositivo dispositivo) {
        try {
            return dispositivi.save(dispositivo);
        }catch (Exception e){
            log.error(String.format("salvataggio non riuscito di",dispositivo),e);
            return null;
        }
    }

    @Override
    public Optional<Dispositivo> update(Long dispositivoId, Dispositivo dispositivo) {
        try {
            var d = dispositivi.findById(dispositivoId).orElseThrow();
            d.builder()
                    .withDipendente(d.getDipendente())
                    .withStatoDispositivo(d.getStatoDispositivo())
                    .withTipoDispositivo(d.getTipoDispositivo())
                    .build();
            return Optional.of(dispositivi.save(d));

        } catch (NoSuchElementException e){
            log.error(String.format("dispositivo con id = %s non trovato", dispositivoId), e);
        }
        return Optional.empty();
    }

    @Override
    public Optional<Dispositivo> delete(Long dispositivoId) {
        try {
            var dis = dispositivi.findById(dispositivoId).orElseThrow();
            dispositivi.delete(dis);
            return Optional.of(dis);
        }catch (NoSuchElementException e){
            log.error(String.format("dispositivo non trovato con id = %s",dispositivoId),e);
            throw new RuntimeException("non trovo il dispositivo");
        }catch (Exception ex){
            log.error(String.format("errore eliminazione dispositivo con id = %s",dispositivoId),ex);
            throw new RuntimeException();
        }
    }

    @Override
    public Dispositivo assign(Long dispositivoId, Long dipendenteId) {
        var d = dispositivi.findById(dispositivoId)
                .orElseThrow(()-> new RuntimeException("dispositivo non trovato"));
        if (d.getStatoDispositivo() != StatoDispositivo.DISPONIBILE){
            throw new RuntimeException("Il dispositivo non è disponibile per l'assegnazione");
        }
        var di = dipendenti.findById(dipendenteId)
                .orElseThrow(()-> new RuntimeException("dipendente non trovato"));
        d.setDipendente(di);
        d.setStatoDispositivo(StatoDispositivo.ASSEGNATO);
        return dispositivi.save(d);
    }

    @Override
    public Dispositivo removeAssignedDevice(Long dispositivoId, Long dipendenteId) {
        var d = dispositivi.findById(dispositivoId)
                .orElseThrow(()->new RuntimeException("dispotivo non trovato"));
        if (d.getDipendente() == null || !d.getDipendente().getId().equals(dipendenteId)){
            throw new RuntimeException("il dispositivo non puo essere assegnato allo specifico dipendente");
        }
        d.setDipendente(null);
        d.setStatoDispositivo(StatoDispositivo.DISPONIBILE);
        return dispositivi.save(d);
    }
}

