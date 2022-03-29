package com.company.Task10;

public class File extends Directory
{
    public File(String dirName) {
        this.dirName = dirName;
    }

    public void ReadInfo() {
        System.out.println("Файл считан");
    }
    public void WriteInfo() {
        System.out.println("Файл записан");
    }

    public void printDirName() {
        System.out.println(dirName);
    }
}
