package com.epicode.m5s1g5test.data;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "workstation")
@Builder(setterPrefix = "with")

public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @Enumerated(EnumType.STRING)
    private Type typeOfWorkStation;
    private int maxUser;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;


}
