package tech.amg.behavioral.strategy;

public class CreditCardPayment implements PaymentWay{
    @Override
    public boolean canHandle(String paymentMethod) {
        return paymentMethod.equals("credit card");
    }

    @Override
    public void processPayment() {
        System.out.println("Process with credit card");
    }
}
