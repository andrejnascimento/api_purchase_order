package models;

import java.math.BigDecimal;

public class DebitCard implements PaymentType{

    public String bankNumber;
    public String agencyNumber;
    public String accountNumber;
    public String cvc;
    public String name;
    public String brand;


    @Override
    public String payment(BigDecimal amount) {
        return null;
    }

    @Override
    public String checkStatus(String amount) {
        return null;
    }
}
