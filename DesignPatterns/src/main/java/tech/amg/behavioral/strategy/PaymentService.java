package tech.amg.behavioral.strategy;

public class PaymentService {

    public void processPayment(String paymentWay){
        if(paymentWay.equals("credit card")) System.out.println("Process with credit card");
        else if(paymentWay.equals("debit card")) System.out.println("Process with debit card");
        else if(paymentWay.equals("paypal")) System.out.println("Process with paypal");
    }
}
