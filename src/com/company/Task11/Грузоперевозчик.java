package com.company.Task11;

public class Грузоперевозчик {
    double averageVelocity;
    double costPerKilometer;
    double distance;
    String city;

    public Грузоперевозчик(double averageVelocity, double costPerKilometer, double distance, String city) {
        this.averageVelocity = averageVelocity;
        this.costPerKilometer = costPerKilometer;
        this.distance = distance;
        this.city = city;
    }

    public double getTime() {
        return distance / averageVelocity;
    }

    public double getCost() {
        return costPerKilometer * distance;
    }

    public void calculate() {
        System.out.println("Время поездки до города " + city + ": " + getTime());
        System.out.println("Стоимость поездки до города " + city + ": " + getCost());
    }
}