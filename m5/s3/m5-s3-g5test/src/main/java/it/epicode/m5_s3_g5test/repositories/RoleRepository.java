package it.epicode.m5_s3_g5test.repositories;

import it.epicode.m5_s3_g5test.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
    Optional<RoleEntity> findOneByName(String name);
}
