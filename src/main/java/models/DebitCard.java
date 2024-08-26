package models;

import java.math.BigDecimal;

public class DebitCard implements PaymentType{

    private String bankNumber;
    private String agencyNumber;
    private String accountNumber;
    private String brand;

    public String getBankNumber() {
        return bankNumber;
    }

    public String getAgencyNumber() {
        return agencyNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
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
