package com.company.Task13;

public class Студент extends Учащийся {

    String university;
    String faculty;
    int kurs;

    public Студент(String name, String university, String faculty, int kurs) {
        this.name = name;
        this.university = university;
        this.faculty = faculty;
        this.kurs = kurs;
    }

    public void printStudentInfo() {
        System.out.println("Имя студента: " + name);
        System.out.println("Университет: " + university);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + kurs);
    }
}