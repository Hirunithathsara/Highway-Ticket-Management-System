package lk.ijse.gdse66.customerservice.repo;

import lk.ijse.gdse66.customerservice.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<TicketEntity, String> {
}
