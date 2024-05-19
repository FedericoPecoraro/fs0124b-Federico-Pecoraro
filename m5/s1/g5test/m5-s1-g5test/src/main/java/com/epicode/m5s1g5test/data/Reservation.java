package com.epicode.m5s1g5test.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reservation")
@Builder(setterPrefix = "with")

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_username")
    private User user;

    @ManyToOne
    @JoinColumn(name = "workstation_id")
    private Workstation workstation;

    @Column(name = "date_reservation")
    private LocalDate dateReservation ;
}
