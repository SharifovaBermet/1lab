package com.company.Task3;

public class Leader extends Ingeneer
{

    public Leader(String name) {
        super(name);
    }

    public void Work() {
        System.out.println("Руководитель " + name + " работает");
    }
}