package com.company.Task1;

public abstract class Book
{
    int cipher;
    String author;
    String publishing;
    String name;
    int year;

    public void printInfo()
    {
        System.out.println("Шифр: " + cipher);
        System.out.println("Автор: " + author);
        System.out.println("Издательство: " + publishing);
        System.out.println("Название: " + name);
        System.out.println("Год выпуска: " + year);
    }
}
