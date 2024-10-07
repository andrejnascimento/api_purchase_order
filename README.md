```mermaid

---
title: Class Diagram
---

classDiagram
    class PaymentType{
        <<interface>>
        payment(amount) String
        checkStatus(hash) PaymentStatus
    }

    class PaymentStatus{
        - String status
        - String description
    }

    class DebitCard{
        - String bankNumber
        - String agancyNumber
        - String accountNumber
        - String brand
        payment(amount) String
        checkStatus(hash) PaymentStatus
    }

    class CreditCard{
        - String number
        - String cvc
        - Date validationDate
        - String brand
        payment(amount) String
        checkStatus(hash) PaymentStatus
    }

    class GatewayMastercard{
        processPayment(card, amount) String
        verifyPayment(hash) PaymentStatus
    }

    class GatewayVisa{
        processPayment(card, amount) String
        verifyPayment(hash) PaymentStatus

    }


    DebitCard ..|> PaymentType : implements
    CreditCard ..|> PaymentType : implements
    PaymentType ..> PaymentStatus

    DebitCard --> GatewayType : uses
    CreditCard --> GatewayType : uses
    GatewayMastercard ..|> GatewayType : implements
    GatewayVisa ..|> GatewayType : implements