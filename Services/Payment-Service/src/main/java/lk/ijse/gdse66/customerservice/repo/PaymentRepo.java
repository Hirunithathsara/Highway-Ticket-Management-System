package lk.ijse.gdse66.customerservice.repo;

import lk.ijse.gdse66.customerservice.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<PaymentEntity, String> {
}
