package lk.ijse.gdse66.customerservice.repo;

import lk.ijse.gdse66.customerservice.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<VehicleEntity, String> {
}
