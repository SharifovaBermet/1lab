package com.company.Task10_2;

public class Wagon extends Transport {

    public Wagon(double averageVelocity, double costPerKilometer, double distance) {
        this.averageVelocity = averageVelocity;
        this.costPerKilometer = costPerKilometer;
        this.distance = distance;
    }

    public void calculate() {
        System.out.println("Время поездки на повозке: " + getTravelTime() + " ч");
        System.out.println("Стоимость поездки на повозке: " + getTravelCost() + " сом");
    }
}
