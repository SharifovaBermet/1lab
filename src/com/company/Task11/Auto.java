package com.company.Task11;

public class Auto extends Грузоперевозчик {

    public Auto(double averageVelocity, double costPerKilometer, double distance, String city) {
        super(averageVelocity, costPerKilometer, distance, city);
    }

    @Override
    public void calculate() {
        System.out.println("Время поездки на машине до города " + city + ": " + getTime() + " ч");
        System.out.println("Стоимость поездки на машине до города " + city + ": " + getCost() + " сом");
    }
}
