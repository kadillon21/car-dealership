package com.pluralsight;

public class LeaseContract extends Contract{

    private double expectedEndingValue = .5;
    private double leaseFee = .07;

    public LeaseContract(double expectedEndingValue, double leaseFee) {
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }

    @Override
    public double getTotalPrice() {
        double endingValue = expectedEndingValue * vehicleSold.getPrice();
        return endingValue + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        return 0.04 / 36;
    }
}
