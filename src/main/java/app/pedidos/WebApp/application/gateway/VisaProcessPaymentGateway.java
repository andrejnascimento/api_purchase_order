package app.pedidos.WebApp.application.gateway;

import app.pedidos.WebApp.domain.gateway.ProcessPaymentCreditGateway;
import app.pedidos.WebApp.domain.models.CreditCard;
import app.pedidos.WebApp.domain.models.PaymentStatus;

public class VisaProcessPaymentGateway implements ProcessPaymentCreditGateway {

    @Override
    public PaymentStatus execute(CreditCard creditcard) {
        return null;
    }
}
