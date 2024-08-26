package models;

import java.math.BigDecimal;
import java.util.Date;

public class CreditCard implements PaymentType{

    private String number;
    private String cvc;
    private Date validationDate;
    private String brand;

    public String getNumber() {
        return number;
    }

    public String getCvc() {
        return cvc;
    }

    public Date getValidationDate() {
        return validationDate;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String payment(BigDecimal amount) {
        return null;
    }

    @Override
    public PaymentStatus checkStatus(String statusName) {
        return null;
    }
}
