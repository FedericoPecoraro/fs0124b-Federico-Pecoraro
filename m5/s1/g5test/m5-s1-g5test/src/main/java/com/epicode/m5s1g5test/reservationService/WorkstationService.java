package com.epicode.m5s1g5test.reservationService;

import com.epicode.m5s1g5test.data.Building;
import com.epicode.m5s1g5test.data.Type;
import com.epicode.m5s1g5test.data.Workstation;
import com.epicode.m5s1g5test.repository.WorkstationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

public class WorkstationService {
    @Autowired
    private WorkstationRepo workstationRepository;

    @Autowired
    private BuildingRepo buildingRepository;

    public Workstation findById(Long id) {
        Optional<Workstation> workstationOptional = workstationRepo.findById(id);
        return workstationOptional.orElse(null);
    }

    public List<WorkstationRepo> findByTypeOfWorkStationAndBuilding(Type type, String city) {
        Building building = buildingRepo.findByCity(city);

        if (building != null) {
            return workstationRepo.findByTypeAndBuilding(type, building);
        } else {
            return Collections.emptyList();
        }
    }
}
