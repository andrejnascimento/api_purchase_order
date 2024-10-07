package app.pedidos.WebApp.domain.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CreditCard {

    private String number;
    private String cvc;
    private Date validationDate;
    private String brand;
    private BigDecimal amount;


}
