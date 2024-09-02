package models;

import java.math.BigDecimal;

public interface PaymentType {

   public String payment(BigDecimal statusName);

   public PaymentStatus checkStatus(String hash);


}
