package com.company.Task5;

public class Theatre extends PublicBuilding
{
    boolean isPlaying;

    public Theatre(int humans, int floors, boolean isPlaying)
    {
        this.humans = humans;
        this.floors = floors;
        this.isPlaying = isPlaying;
    }

    public void printInfo()
    {
        System.out.println("Человек в театре: " + humans);
        System.out.println("Этажей в театре: " + floors);
        if (isPlaying)
            System.out.println("Сейчас в театре идёт спектакль");
        else
            System.out.println("Сейчас в театре не идёт спектакль");
    }

    @Override
    public int getHumanCount() {
        return humans;
    }

    @Override
    public int getFloorsCount() {
        return floors;
    }
}