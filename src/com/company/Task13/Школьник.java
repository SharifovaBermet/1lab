package com.company.Task13;

public class Школьник extends Учащийся {

    int schoolNumber;
    int gradeNumber;

    public Школьник(String name, int schoolNumber, int gradeNumber) {
        this.name = name;
        this.schoolNumber = schoolNumber;
        this.gradeNumber = gradeNumber;
    }

    public void printStudentInfo() {
        System.out.println("Имя школьника: " + name);
        System.out.println("Номер школы: " + schoolNumber);
        System.out.println("Класс: " + gradeNumber);
    }
}Студент
