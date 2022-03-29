package com.company.Task2;


public class StudentOfFaculty extends Student
{
    String facultyName;

    public void walks()
    {
        System.out.println("Студент факультета ходит");
    }

    public void Learn()
    {
        System.out.println("Студент факультета учится");
    }

    String getFacultyName()
    {
        return facultyName;
    }
}
