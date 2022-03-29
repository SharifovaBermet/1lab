package com.company.Task4;

public class College implements Educationalinstitution
{
    String name;
    String location;
    int studentCount;

    College(String name, String location, int studentCount)
    {
        this.name = name;
        this.location = location;
        this.studentCount = studentCount;
    }

    public String getLocation() { return location; }
    public String getName() { return name; }
    public int getStudentCount() { return studentCount; }
}