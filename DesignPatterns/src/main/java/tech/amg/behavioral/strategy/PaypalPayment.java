package tech.amg.behavioral.strategy;

public class PaypalPayment implements PaymentWay{
    @Override
    public boolean canHandle(String paymentMethod) {
        return paymentMethod.equals("paypal");
    }

    @Override
    public void processPayment() {
        System.out.println("Process with paypal");
    }
}
