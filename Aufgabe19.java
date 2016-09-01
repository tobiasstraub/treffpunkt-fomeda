package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.ArrayList;
import java.util.Collections;

public class Aufgabe19 {
    public static void main(String args[]) {
        Aufgabe19Person[] personenArray = new Aufgabe19Person[6];
        ArrayList<Aufgabe19Person> personenArrayList = new ArrayList<>();

        Aufgabe19Person p1 = new Aufgabe19Person("Sheldon", 30);
        Aufgabe19Person p2 = new Aufgabe19Person("Penny", 28);
        Aufgabe19Person p3 = new Aufgabe19Person("Leonard", 30);
        Aufgabe19Person p4 = new Aufgabe19Person("Raj", 30);
        Aufgabe19Person p5 = new Aufgabe19Person("Howard", 30);

        personenArray[0] = p1;
        personenArray[2] = p2;
        personenArray[3] = p3;
        personenArray[4] = p4;
        personenArray[5] = p5;

        personenArrayList.add(p1);
        personenArrayList.add(p2);
        personenArrayList.add(p3);
        personenArrayList.add(p4);
        personenArrayList.add(p5);

        Collections.sort(personenArrayList);
        System.out.println("Nach Namen sortierte Ausgabe: ");
        for (Aufgabe19Person person : personenArrayList) {
            System.out.println(person.toString());
        }

        System.out.println();

        Collections.sort(personenArrayList, new Aufgabe19ComparatorHandler());
        System.out.println("Nach Alter und Namen sortierte Ausgabe: ");
        for (Aufgabe19Person person : personenArrayList) {
            System.out.println(person.toString());
        }
    }
}