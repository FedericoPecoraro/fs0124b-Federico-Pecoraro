package com.epicode.m5s1g5test.reservationService;

import com.epicode.m5s1g5test.data.Reservation;
import com.epicode.m5s1g5test.data.User;
import com.epicode.m5s1g5test.data.Workstation;
import com.epicode.m5s1g5test.repository.ReservationRepo;
import com.epicode.m5s1g5test.repository.UserRepo;
import com.epicode.m5s1g5test.repository.WorkstationRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private ReservationRepo reservationRepo;

    @Autowired
    private WorkstationRepo workstationRepo;

    @Autowired
    private UserRepo userRepo;

    public ReservationRepo createReservation(String username, Long workstationId, LocalDate date){
        User user = userRepo.findById(Integer.valueOf(username))
                .orElseThrow(() -> new RuntimeException("User not found"));
        Workstation workstation = workstationRepo.findById(Math.toIntExact(workstationId))
                .orElseThrow(() -> new RuntimeException("Workstation not found"));

        Reservation reservation = new Reservation();

        return (ReservationRepo) reservationRepo.save(reservation);
    }
}
