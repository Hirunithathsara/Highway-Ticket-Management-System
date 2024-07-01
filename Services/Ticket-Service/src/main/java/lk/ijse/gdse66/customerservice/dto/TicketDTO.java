package lk.ijse.gdse66.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TicketDTO {
    private String ticket_id;
    private String ticket_description;
    private String ticket_price;
    private String ticket_quantity;
}
