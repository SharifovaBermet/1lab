package com.company.Task4;

public class Univercity extends College
{
    int facultyCount;

    public Univercity(String name, String location, int studentCount, int facultyCount)
    {
        super(name, location, studentCount);
        this.facultyCount = facultyCount;
    }

    public int getFacultyCount() { return facultyCount; }
}