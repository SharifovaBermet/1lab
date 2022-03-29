package com.company.Task9;

public class CargoShip implements Ship
{
    public void startSail() {
        System.out.println("Грузовой корабль начал плыть");
    }
    public void stopSail() {
        System.out.println("Грузовой корабль закончил плыть");
    }
    public void changeDirection() {
        System.out.println("Грузовой корабль изменил своё направление");
    }
    public void refuel() {
        System.out.println("Грузовой корабль пополнил горючее");
    }
}
