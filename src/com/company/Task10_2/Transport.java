package com.company.Task10_2;

public abstract class Transport {
    double averageVelocity;
    double costPerKilometer;
    double distance;

    public double getTravelTime() {
        return distance / averageVelocity;
    }

    public double getTravelCost() {
        return costPerKilometer * distance;
    }

    public abstract void calculate();
}