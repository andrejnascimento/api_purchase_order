package models;

import java.math.BigDecimal;

public interface PaymentType {

   public String payment(BigDecimal amount);

   public PaymentStatus checkStatus(String hash);


}
