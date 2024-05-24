package it.epicode.g5test.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "dipendente")
@Entity
@Builder(setterPrefix = "with")
public class Dipendente {
    @Column (name = "nome", nullable = false)
    private String nome;
    @Column (name = "nome_utente", nullable = false)
    private String nomeUtente;
    @Column (name = "cognome", nullable = false)
    private String cognome;
    @Column (name = "email", nullable = false)
    private String email;
    @OneToMany (mappedBy = "dipendente")
    private List<Dispositivo> dispositivi;
}