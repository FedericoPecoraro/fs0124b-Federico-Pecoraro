package it.epicode.m5_s3_g5test.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class EntityBase {
    @Id
    @GeneratedValue
    private Long id;
}
