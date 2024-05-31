package it.epicode.m5_s3_g5test.entities;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")

public class Events extends EntityBase {
    private String titolo;
    private String descrizione;
    private String data;
    private String luogo;
    private Integer postiDisponibili;
    private Integer postiPrenotati;
    private boolean disponibilitàPrenotazione = true;
}
