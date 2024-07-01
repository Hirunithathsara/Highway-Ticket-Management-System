package lk.ijse.gdse66.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PaymentDTO {
    private String payment_id;
    private String payment_type;
    private String payment_amount;
    private String payment_currency;
}
