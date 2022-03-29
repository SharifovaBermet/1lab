package com.company.Task10_2;

public class Auto extends Transport {

    public Auto(double averageVelocity, double costPerKilometer, double distance) {
        this.averageVelocity = averageVelocity;
        this.costPerKilometer = costPerKilometer;
        this.distance = distance;
    }

    public void calculate() {
        System.out.println("Время поездки на машине: " + getTravelTime() + " ч");
        System.out.println("Стоимость поездки на машине: " + getTravelCost() + " сом");
    }
}