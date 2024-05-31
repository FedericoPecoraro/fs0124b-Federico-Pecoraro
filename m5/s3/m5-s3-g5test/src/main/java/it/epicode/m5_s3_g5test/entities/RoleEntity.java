package it.epicode.m5_s3_g5test.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")

public class RoleEntity extends EntityBase {
    @Column(length = 15, unique = true)
    private String nome;

    @ManyToMany(mappedBy = "roles")
    private final List<Utente> users = new ArrayList<>();

}
