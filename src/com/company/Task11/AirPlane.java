package com.company.Task11;

public class AirPlane extends Грузоперевозчик {

    public AirPlane(double averageVelocity, double costPerKilometer, double distance, String city) {
        super(averageVelocity, costPerKilometer, distance, city);
    }

    @Override
    public void calculate() {
        System.out.println("Время поездки на самолете до города " + city + ": " + getTime() + " ч");
        System.out.println("Стоимость поездки на самолете до города " + city + ": " + getCost() + " сом");
    }
}
