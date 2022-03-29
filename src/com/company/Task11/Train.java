package com.company.Task11;


public class Train extends Грузоперевозчик {

    public Train(double averageVelocity, double costPerKilometer, double distance, String city) {
        super(averageVelocity, costPerKilometer, distance, city);
    }

    @Override
    public void calculate() {
        System.out.println("Время поездки на поезде до города " + city + ": " + getTime() + " ч");
        System.out.println("Стоимость поездки на поезде до города " + city + ": " + getCost() + " сом");
    }
}
