package it.epicode.m5_s3_g5test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@Builder(setterPrefix = "with")

public class UserEntity extends EntityBase {
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
