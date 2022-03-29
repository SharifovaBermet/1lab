package com.company.Task14;

public class Струнный implements МузыкальныйИнструмент {
    @Override
    public void Play() {
        System.out.println("Струнный инструмент играет");
    }

    @Override
    public void ChangeTune() {
        System.out.println("Струнный инструмент изменил тональность");
    }

    @Override
    public void CleanUp() {
        System.out.println("Струнный инструмент почищен");
    }
}
