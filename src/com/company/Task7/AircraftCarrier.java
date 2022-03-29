package com.company.Task7;

public class AircraftCarrier extends MilitaryShip
{
    int aircraftCount;

    public AircraftCarrier(int aircraftCount) {
        this.aircraftCount = aircraftCount;
    }

    public void Fire() {
        System.out.println("ОГОНЬ!!!");
    }

    public void Reload() {
        System.out.println("ПЕРЕЗАРЯДКА!!!");
    }

    public void releaseAircraft() {
        System.out.println("Самолет выпущен");
    }
    public void takeAircraft() {
        System.out.println("Самолет прилетел");
    }

    public int getAircraftCount() { return aircraftCount; }
}