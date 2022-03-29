package com.company.Task9;

public class Tanker extends CargoShip
{
    public void startSail() {
        System.out.println("Танкер начал плыть");
    }
    public void stopSail() {
        System.out.println("Танкер закончил плыть");
    }
    public void changeDirection() {
        System.out.println("Танкер изменил своё направление");
    }
    public void refuel() {
        System.out.println("Танкер пополнил горючее");
    }
}
