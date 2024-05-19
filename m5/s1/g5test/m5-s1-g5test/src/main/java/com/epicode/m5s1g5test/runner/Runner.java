package com.epicode.m5s1g5test.runner;

import com.epicode.m5s1g5test.data.Building;
import com.epicode.m5s1g5test.data.Type;
import com.epicode.m5s1g5test.data.User;
import com.epicode.m5s1g5test.data.Workstation;
import com.epicode.m5s1g5test.repository.BuildingRepo;
import com.epicode.m5s1g5test.repository.ReservationRepo;
import com.epicode.m5s1g5test.repository.UserRepo;
import com.epicode.m5s1g5test.repository.WorkstationRepo;
import com.epicode.m5s1g5test.reservationService.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final BuildingRepo buildingRepository;
    private final UserRepo userRepository;
    private final WorkstationRepo workstationRepository;
    private final ReservationRepo reservationRepository;
    private final ReservationService reservationService;

    @Autowired
    public Runner(BuildingRepo buildingRepository, UserRepo userRepository, WorkstationRepo workstationRepository, ReservationRepo reservationRepository, ReservationService reservationService) {
        this.buildingRepository = buildingRepository;
        this.userRepository = userRepository;
        this.workstationRepository = workstationRepository;
        this.reservationRepository = reservationRepository;
        this.reservationService = reservationService;
    }
    @Override
    public void run(String... args) throws Exception {
        try {
            Building building0 = Building.builder()
                    .withName("Sala Grande")
                    .withAddress("Via Libertà")
                    .withCity("Palermo")
                    .build();

            Building building1 = Building.builder()
                    .withName("Sala Media")
                    .withAddress("Via Dante")
                    .withCity("Palermo")
                    .build();

            Building building2 = Building.builder()
                    .withName("Sala Piccola")
                    .withAddress("Via Itaca")
                    .withCity("Palermo")
                    .build();

            User user0 = User.builder()
                    .withId(1L)
                    .withName("Federico Pecoraro")
                    .withEmail("fede@peco.com")
                    .withUsername("0")
                    .build();

            User user1 = User.builder()
                    .withId(2L)
                    .withName("Sara Chifari")
                    .withEmail("sara@chif.com")
                    .withUsername("1")
                    .build();

            User user2 = User.builder()
                    .withId(3L)
                    .withName("Jeremy Dog")
                    .withEmail("jer@dog.com")
                    .withUsername("2")
                    .build();

            Workstation workstation0 = Workstation.builder()
                    .withId(1L)
                    .withBuilding(building0)
                    .withDescription("Sala usata per fare le riunioni")
                    .withMaxUser(4)
                    .withType(Type.PRIVATE)
                    .build();

            Workstation workstation1 = Workstation.builder()
                    .withId(2L)
                    .withBuilding(building0)
                    .withDescription("Sala usata")
                    .withMaxUser(9)
                    .withType(Type.OPEN_SPACE)
                    .build();

            Workstation workstation2 = Workstation.builder()
                    .withId(3L)
                    .withBuilding(building0)
                    .withDescription("Sala")
                    .withMaxUser(2)
                    .withType(Type.MEETING_ROOM)
                    .build();

            buildingRepository.save(building0);
            buildingRepository.save(building1);
            buildingRepository.save(building2);
            userRepository.save(user0);
            userRepository.save(user1);
            userRepository.save(user2);
            workstationRepository.save(workstation0);
            workstationRepository.save(workstation1);
            workstationRepository.save(workstation2);

            reservationService.createReservation(user1.getId(), workstation0.getId(), LocalDate.now().plusYears(1));
            reservationService.createReservation(user0.getId(), workstation2.getId(), LocalDate.now().plusMonths(1));
            reservationService.createReservation(user2.getId(), workstation1.getId(), LocalDate.now().plusDays(1));

            System.out.println("Edifici salvati correttamente");
            System.out.println("User salvati correttamente");
            System.out.println("Postazioni salvate correttamente");
            System.out.println(reservationService.createReservation(user1.getId(), workstation0.getId(), LocalDate.now()));
            System.out.println(reservationService.createReservation(user0.getId(), workstation2.getId(), LocalDate.now()));
            System.out.println(reservationService.createReservation(user2.getId(), workstation1.getId(), LocalDate.now().plusDays(1)));

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("basta");
        }

    }
}
