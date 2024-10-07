package app.pedidos.WebApp.domain.gateway;

import app.pedidos.WebApp.domain.models.CreditCard;
import app.pedidos.WebApp.domain.models.PaymentStatus;

public interface ProcessPaymentCreditGateway {

    PaymentStatus execute(CreditCard creditcard);

}
