package tech.amg.behavioral.strategy;

public interface PaymentWay {
    boolean canHandle(String paymentMethod);
    void processPayment();
}
