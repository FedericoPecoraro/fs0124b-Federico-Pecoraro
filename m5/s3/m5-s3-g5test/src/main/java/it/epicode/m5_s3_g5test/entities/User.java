package it.epicode.m5_s3_g5test.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")

public class User extends EntityBase {
    @Column(length = 125, nullable = false)
    private String email;
    @Column(length = 125, unique = true, nullable = false)
    @EqualsAndHashCode.Include
    private String nome;
    @Column(length = 125, nullable = false)
    private String password;
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private final List<RoleEntity> roles = new ArrayList<>();
}
