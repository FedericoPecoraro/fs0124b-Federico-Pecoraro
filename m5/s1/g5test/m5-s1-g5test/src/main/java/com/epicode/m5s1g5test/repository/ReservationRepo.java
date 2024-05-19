package com.epicode.m5s1g5test.repository;

import com.epicode.m5s1g5test.data.Reservation;
import com.epicode.m5s1g5test.data.User;
import com.epicode.m5s1g5test.data.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Integer> {
    List<Reservation> findByUserAndDate(User user, LocalDate date);
    boolean existsByWorkstationAndDateReservation(Workstation workstation, LocalDate dateReservation);
    boolean existsByUserAndDateReservation(User user, LocalDate dateReservation);
}
