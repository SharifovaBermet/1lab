package com.company.Task14;

public class Ударный  implements МузыкальныйИнструмент {
    @Override
    public void Play() {
        System.out.println("Ударный инструмент играет");
    }

    @Override
    public void ChangeTune() {
        System.out.println("Ударный инструмент изменил тональность");
    }

    @Override
    public void CleanUp() {
        System.out.println("Ударный инструмент почищен");
    }
}