package com.company.Task12;

public class Auto extends Пассажир {

    public Auto(double averageVelocity, double costPerKilometer, double distance) {
        super(averageVelocity, costPerKilometer, distance);
    }

    @Override
    public void calculate() {
        System.out.println("Время поездки на машине: " + getTime() + " ч");
        System.out.println("Стоимость поездки на машине: " + getCost() + " сом");
    }
}
