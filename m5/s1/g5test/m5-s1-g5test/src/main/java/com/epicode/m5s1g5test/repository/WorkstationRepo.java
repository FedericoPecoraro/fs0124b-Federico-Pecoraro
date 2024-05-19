package com.epicode.m5s1g5test.repository;

import com.epicode.m5s1g5test.data.Building;
import com.epicode.m5s1g5test.data.Type;
import com.epicode.m5s1g5test.data.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface WorkstationRepo extends JpaRepository<Workstation, Integer> {
    List<WorkstationRepo> findByTypeOfWorkstationAndBuilding (Type type, Building building);
    Optional<Workstation> findById(long id);
}
