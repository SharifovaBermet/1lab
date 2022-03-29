package com.company.Task12;

public class Пассажир {
    double averageVelocity;
    double costPerKilometer;
    double distance;

    public Пассажир(double averageVelocity, double costPerKilometer, double distance) {
        this.averageVelocity = averageVelocity;
        this.costPerKilometer = costPerKilometer;
        this.distance = distance;
    }

    public double getTime() {
        return distance / averageVelocity;
    }

    public double getCost() {
        return costPerKilometer * distance;
    }

    public void calculate() {
        System.out.println("Время поездки: " + getTime());
        System.out.println("Стоимость поездки до города: " + getCost());
    }
}
