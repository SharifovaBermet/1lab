package com.company;

import com.company.Task1.*;
import com.company.Task2.*;
import com.company.Task3.*;
import com.company.Task4.*;
import com.company.Task5.*;
import com.company.Task6.*;
import com.company.Task7.*;
import com.company.Task8.*;
import com.company.Task9.*;
import com.company.Task10.*;
import com.company.Task10_2.*;
import com.company.Task11.*;
import com.company.Task12.*;
import com.company.Task13.*;
import com.company.Task14.*;
import com.company.Task16.*;
import com.company.Task17.*;
import com.company.Task18.*;

public class Main {

    public static void main(String[] args) {
        //Task 1
        /*Directory directory = new Directory(111,"Автор","Бермет","Справочник",2002);
        Encyclopedia encyclopedia = new Encyclopedia(222,"Автор 2", "Бермет","Энциклопедия", 2012);
        directory.printInfo();
        encyclopedia.printInfo();*/

        //Task 2
        /*Student student = new Student();
        student.Walks();
        student.Learn();
        StudentOfFaculty student1 = new StudentOfFaculty();
        student.Walks();
        student.Learn();*/

        //Task 3
        /* Worker worker1 = new Ingeneer("Bermet");
        worker1.Work();
        Worker worker2 = new Leader("Bermeta");
        worker2.Work();*/

        //Task 4
        /*Univercity Политех = new Univercity("KSTU", "Bishkek", 10000, 10);
        System.out.println(Политех.getLocation());
        System.out.println(Политех.getName());
        System.out.println(Политех.getStudentCount());
        System.out.println(Политех.getFacultyCount());*/

        //Task 5
        /*Theatre theatre = new Theatre(1000,4,true);
        theatre.printInfo();*/

        //Task 6
        /* Model phone = new Model(1000,4500);
        System.out.println("Phone ID: " + phone.siemensID());
        phone.Play("Brawl Stars");
        phone.Call("0508028803");
        phone.Listen("Rihanna - Desperado");*/

        //Task 7
        /*AircraftCarrier aircraftCarrier = new AircraftCarrier(7);
        aircraftCarrier.startSail();
        aircraftCarrier.releaseAircraft();
        aircraftCarrier.takeAircraft();
        aircraftCarrier.Fire();
        aircraftCarrier.Fire();
        aircraftCarrier.Reload();
        aircraftCarrier.refuel();
        aircraftCarrier.changeDirection();
        aircraftCarrier.stopSail();*/

        //Task 8
        /*Doctor doc1 = new Surgeon();
        doc1.Lechit();
        Doctor doc2 = new Neurosurgeon();
        doc2.Lechit();*/

        //Task 9
        /*task9.Ship ship1 = new CargoShip();
        ship1.startSail();
        ship1.stopSail();
        task9.Ship ship2 = new Tanker();
        ship2.changeDirection();
        ship2.refuel();*/

        //Task 10
        /*File file1 = new File("Папка");
        file1.ReadInfo();
        file1.printDirName();
        file1.WriteInfo();*/

        //Task 10_2
        /*Transport auto = new Auto(60.0,25.0,10.0);
        auto.calculate();
        Transport bicycle = new Bicycle(10.0, 1.0, 10.0);
        bicycle.calculate();
        Transport wagon = new Wagon(15.0, 10.0, 10.0);
        wagon.calculate();*/

        //Task 11
        /*Грузоперевозчик auto = new Auto(75.0, 25.0,100.0,"Бишкек");
        Грузоперевозчик plane = new AirPlane(300.0, 110.0,100.0,"Бишкек");
        Грузоперевозчик train = new Train(150.0, 2.5,100.0,"Бишкек");
        auto.calculate();
        plane.calculate();
        train.calculate();*/

        //Task 12
        /*Пассажир auto = new task12.Auto(75.0, 25.0,100.0);
        Пассажир plane = new task12.AirPlane(300.0, 110.0,100.0);
        Пассажир train = new task12.Train(150.0, 2.5,100.0);
        auto.calculate();
        plane.calculate();
        train.calculate();*/

        //Task 13
        /*Учащийся учащийся1 = new Студент("Бермет", "Политех", "ФИТ", 2);
        Учащийся учащийся2 = new Школьник("Данил", 4, 3);
        Учащийся учащийся3 = new Студент("Глеб", "КРСУ", "Экономический факультет", 1);
        Учащийся[] учащиеся = new Учащийся[]{учащийся1,учащийся2,учащийся3};
        for (int i =0;i<учащиеся.length;i++)
            учащиеся[i].printStudentInfo();*/

        //Task 14
        /*МузыкальныйИнструмент барабаны = new Ударный();
        МузыкальныйИнструмент скрипка = new Струнный();
        МузыкальныйИнструмент свирель = new Духовой();
        МузыкальныйИнструмент[] оркастр = new МузыкальныйИнструмент[] {барабаны, скрипка, свирель};
        барабаны.Play();
        скрипка.Play();
        свирель.Play();*/

        //Task 16
        /*РаботникФирмы аналитик = new Аналитик();
        аналитик.printMessage();
        РаботникФирмы дизайнер = new Дизайнер();
        дизайнер.printMessage();
        РаботникФирмы менеджер = new Менеджер();
        менеджер.printMessage();
        РаботникФирмы программист = new Программист();
        программист.printMessage();
        РаботникФирмы тестировщик = new Тестировщик();
        тестировщик.printMessage();*/

        //Task 17
        /*ДомашнееЖивотное собака = new Собака("Барсик", 1, 2);
        ДомашнееЖивотное кошка = new Кошка("Лоя", 2, 3);
        ДомашнееЖивотное попугай = new Попугай("Кеша", 1, 1);*/

        //Task 18
        /*СадовоеДерево яблоня = new Яблоня(100,5);
        СадовоеДерево вишня = new Вишня(5,3);
        СадовоеДерево груша = new Груша(50,8);
        СадовоеДерево вишня2 = new Вишня(60,11);
        СадовоеДерево[] деревья = new СадовоеДерево[] {яблоня,вишня,груша, вишня2};
        for (int i = 0; i < деревья.length; i++)
            деревья[i].checkTree();*/
    }
}

