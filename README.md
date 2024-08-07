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

    DebitCard ..|> PaymentType : implements
    CreditCard ..|> PaymentType : implements
    PaymentType ..> PaymentStatus
