package com.company.Task10_2;

public class Bicycle extends Transport {

    public Bicycle(double averageVelocity, double costPerKilometer, double distance) {
        this.averageVelocity = averageVelocity;
        this.costPerKilometer = costPerKilometer;
        this.distance = distance;
    }

    public void calculate() {
        System.out.println("Время поездки на велосипеде: " + getTravelTime() + " ч");
        System.out.println("Стоимость поездки на велосипеде: " + getTravelCost() + " сом");
    }
}
