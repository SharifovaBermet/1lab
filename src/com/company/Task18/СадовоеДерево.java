package com.company.Task18;

public class СадовоеДерево {
    static int totalCount = 0;
    int number;
    int plodonoshenie;
    int age;

    public СадовоеДерево(int plodonoshenie, int age) {
        this.plodonoshenie = plodonoshenie;
        this.age = age;
        totalCount++;
        this.number = totalCount;
    }

    public void checkTree() {
        if (age >= 10 || plodonoshenie < 20)
            System.out.println("Дерево №" + number + " подлежит пересадке!");
    }
}