package tech.amg.behavioral.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        boolean isRunning = true;
        Scanner input = new Scanner(System.in);
        while (isRunning){
            System.out.print("Enter payment way : ");
            String paymentWay = input.nextLine();
            if(!paymentWay.equals("0"))paymentService.processPayment(paymentWay);
            else isRunning = false;
        }
    }
}
