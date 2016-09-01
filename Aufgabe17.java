package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.ArrayList;

public class Aufgabe17 {
    public static void main(String args[]) {
        Aufgabe17Person[] personenArray = new Aufgabe17Person[5];
        ArrayList<Aufgabe17Person> personenArrayList = new ArrayList<>();

        Aufgabe17Person p1 = new Aufgabe17Person("Sheldon", 30);
        Aufgabe17Person p2 = new Aufgabe17Person("Penny", 28);
        Aufgabe17Person p3 = new Aufgabe17Person("Leonard", 30);
        Aufgabe17Person p4 = new Aufgabe17Person("Raj", 30);
        Aufgabe17Person p5 = new Aufgabe17Person("Howard", 30);

        personenArray[0] = p1;
        personenArray[1] = p2;
        personenArray[2] = p3;
        personenArray[3] = p4;
        personenArray[4] = p5;

        personenArrayList.add(p1);
        personenArrayList.add(p2);
        personenArrayList.add(p3);
        personenArrayList.add(p4);
        personenArrayList.add(p5);
    }
}