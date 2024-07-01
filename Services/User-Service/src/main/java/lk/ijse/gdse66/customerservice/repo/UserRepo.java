package lk.ijse.gdse66.customerservice.repo;

import lk.ijse.gdse66.customerservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, String> {
}
