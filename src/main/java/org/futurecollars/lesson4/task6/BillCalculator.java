package org.futurecollars.lesson4.task6;

public class BillCalculator {

    private double bill;
    private float service;
    private double discount;

    public double Calculate(double bill, float service) {
        return bill + service;
    }

    public double Calculate(double bill, float service, double discount) {
        return bill - (bill * discount) + service;
    }

    public double Calculate(double bill, float service, short packaging) {
        return bill + service + packaging;
    }
}
