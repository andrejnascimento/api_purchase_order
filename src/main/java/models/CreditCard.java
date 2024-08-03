package models;

import java.math.BigDecimal;

public class CreditCard implements PaymentType{

    public String number;
    public String cvc;
    public String validationDate;
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
