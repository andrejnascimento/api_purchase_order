package app.pedidos.WebApp.domain.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DebitCard {

    private String bankNumber;
    private String agencyNumber;
    private String accountNumber;
    private String brand;
    private BigDecimal amount;

}