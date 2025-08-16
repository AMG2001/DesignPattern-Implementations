package tech.amg.behavioral.strategy;

public class DebitCardPayment implements PaymentWay{
    @Override
    public boolean canHandle(String paymentMethod) {
        return paymentMethod.equals("debit card");
    }

    @Override
    public void processPayment() {
        System.out.println("Process with debit card");
    }
}
