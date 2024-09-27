package app.pedidos.WebApp.domain.usecase;

import app.pedidos.WebApp.domain.gateway.ProcessPaymentCreditGateway;
import app.pedidos.WebApp.domain.models.CreditCard;
import app.pedidos.WebApp.domain.models.PaymentStatus;

public class ProcessPaymentCreditCardUseCase {

    private ProcessPaymentCreditGateway gateway;

        public PaymentStatus execute(CreditCard creditcard){

            return new PaymentStatus();
        }

}
