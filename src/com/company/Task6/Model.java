package com.company.Task6;

import java.util.Random;

public class Model extends SiemensMobile
{
    public Model(int memory, int battery) {
        this.memory = memory;
        this.battery = battery;
    }

    public int siemensID() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public void Call(String number) {
        System.out.println("Звоним по номеру " + number);
    }

    public void Play(String gameName) {
        System.out.println("Запущена игру " + gameName);
    }

    public void Listen(String musicName) {
        System.out.println("Играет песня " + musicName);
    }
}