package com.company.Task14;

public class Духовой implements МузыкальныйИнструмент {
    @Override
    public void Play() {
        System.out.println("Духовой инструмент играет");
    }

    @Override
    public void ChangeTune() {
        System.out.println("Духовой инструмент изменил тональность");
    }

    @Override
    public void CleanUp() {
        System.out.println("Духовой инструмент почищен");
    }
}