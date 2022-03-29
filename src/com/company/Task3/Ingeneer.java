package com.company.Task3;

public class Ingeneer implements Worker
{
    String name;

    public Ingeneer(String name) {
        this.name = name;
    }

    public void Work() {
        System.out.println("Инженер " + name + " работает");
    }
}
