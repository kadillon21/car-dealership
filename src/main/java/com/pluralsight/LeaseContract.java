package com.pluralsight;

public class LeaseContract extends Contract{
    double price = vehicleSold.getPrice();
    double salesTaxAmount = price * 0.05;
    int recordingFee = 100;
    int processingFee;
    boolean financeOption = true;


    @Override
    public double getTotalPrice() {

        if (price < 100000) {
            processingFee = 295;
        } else {
            processingFee = 495;
        }

        return price + salesTaxAmount + recordingFee + processingFee;
    }

    @Override
    public double getMonthlyPayment() {
        double monthlyInterestRate;
        int paymentTerm;

        if (financeOption){
            if (getTotalPrice() >= 10000) {
                monthlyInterestRate = 0.0425 / 12;
                paymentTerm = 48;
            } else {
                monthlyInterestRate = 0.0525 / 12;
                paymentTerm = 24;
            }

            return getTotalPrice() *
                    (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, paymentTerm)) /
                    (Math.pow(1 + monthlyInterestRate, paymentTerm) - 1);
        } else {
            return 0;
        }

    }
}
