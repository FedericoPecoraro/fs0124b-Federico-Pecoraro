package it.epicode.g5test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "dispositivo")
@Entity
@Builder(setterPrefix = "with")
public class Dispositivo extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    private Dipendente dipendente;
    @Enumerated (EnumType.STRING)
    private TipoDispositivo tipoDispositivo;
    @Enumerated (EnumType.STRING)
    private StatoDispositivo statoDispositivo;
}
