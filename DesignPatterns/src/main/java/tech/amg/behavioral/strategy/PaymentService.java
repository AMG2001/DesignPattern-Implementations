package tech.amg.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {

    private List<PaymentWay> paymentWays = new ArrayList<>();

    public PaymentService() {
        initializePaymentWays();
    }

    private void initializePaymentWays() {
        paymentWays.addAll(List.of(
                new CreditCardPayment(),
                new DebitCardPayment(),
                new PaypalPayment()
        ));
    }

    public void processPayment(String paymentWay) {
        for (PaymentWay paymentWayImplementation : paymentWays) {
            if (paymentWayImplementation.canHandle(paymentWay)) paymentWayImplementation.processPayment();
        }
    }
}
