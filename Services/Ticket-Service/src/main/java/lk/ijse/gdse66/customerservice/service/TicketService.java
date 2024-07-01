package lk.ijse.gdse66.customerservice.service;

import lk.ijse.gdse66.customerservice.dto.TicketDTO;
import lk.ijse.gdse66.customerservice.entity.TicketEntity;

import java.util.List;

public interface TicketService {

    void saveTicket(TicketDTO ticketDTO);

    TicketDTO searchTicket(String id);

    void updateTicket(TicketDTO ticketDTO);

    void deleteTicket(String id);

    List<TicketEntity> loadAllTickets();
}
