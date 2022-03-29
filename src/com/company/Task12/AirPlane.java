package com.company.Task12;

public class AirPlane extends Пассажир {

    public AirPlane(double averageVelocity, double costPerKilometer, double distance) {
        super(averageVelocity, costPerKilometer, distance);
    }

    @Override
    public void calculate() {
        System.out.println("Время поездки на самолете: " + getTime() + " ч");
        System.out.println("Стоимость поездки на самолете: " + getCost() + " сом");
    }
}