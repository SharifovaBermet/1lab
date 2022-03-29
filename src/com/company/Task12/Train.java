package com.company.Task12;

public class Train extends Пассажир {

    public Train(double averageVelocity, double costPerKilometer, double distance) {
        super(averageVelocity, costPerKilometer, distance);
    }

    @Override
    public void calculate() {
        System.out.println("Время поездки на поезде до города: " + getTime() + " ч");
        System.out.println("Стоимость поездки на поезде до города: " + getCost() + " сом");
    }
}
