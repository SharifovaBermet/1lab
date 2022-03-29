package com.company.Task7;

public abstract class MilitaryShip implements  Ship
{
    public abstract void Fire();
    public abstract void Reload();

    public void startSail() {
        System.out.println("Корабль начал плыть");
    }
    public void stopSail() {
        System.out.println("Корабль закончил плыть");
    }
    public void changeDirection() {
        System.out.println("Корабль сменил курс");
    }
    public void refuel() {
        System.out.println("Корабль заправляется");
    }
}