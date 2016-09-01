package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.Scanner;

public class Aufgabe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aufgabe14Drucker drucker1 = new Aufgabe14Drucker();
        Aufgabe14Drucker drucker2 = new Aufgabe14Drucker();
        Aufgabe14Drucker drucker3 = new Aufgabe14Drucker();
        Aufgabe14Drucker drucker4 = new Aufgabe14Drucker("Laserdrucker", "hp", 5);

        System.out.println("Bitte geben Sie einen Herstellernamen ein: ");
        drucker1.setHerstellername(sc.nextLine());
        System.out.println("Bitte geben Sie den Typ Ihres Druckers an: ");
        drucker1.setDruckerTyp(sc.nextLine());
        System.out.println("Bitte geben Sie die ID an: ");
        drucker1.setId(Integer.valueOf(sc.nextLine()));

        System.out.println("\nBitte geben Sie einen Herstellernamen ein: ");
        drucker2.setHerstellername(sc.nextLine());
        System.out.println("Bitte geben Sie den Typ Ihres Druckers an: ");
        drucker2.setDruckerTyp(sc.nextLine());
        System.out.println("Bitte geben Sie die ID an: ");
        drucker2.setId(Integer.valueOf(sc.nextLine()));

        System.out.println("\nBitte geben Sie einen Herstellernamen ein: ");
        drucker3.setHerstellername(sc.nextLine());
        System.out.println("Bitte geben Sie den Typ Ihres Druckers an: ");
        drucker3.setDruckerTyp(sc.nextLine());
        System.out.println("Bitte geben Sie die ID an: ");
        drucker3.setId(Integer.valueOf(sc.nextLine()));
    }
}