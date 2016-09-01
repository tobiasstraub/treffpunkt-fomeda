package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Aufgabe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Aufgabe15Drucker> treeDrucker = new TreeMap<Integer, Aufgabe15Drucker>();

        Aufgabe15Drucker drucker1 = new Aufgabe15Drucker();
        Aufgabe15Drucker drucker2 = new Aufgabe15Drucker();
        Aufgabe15Drucker drucker3 = new Aufgabe15Drucker();
        Aufgabe15Drucker drucker4 = new Aufgabe15Drucker("Laserdrucker", "hp", 5);

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

        // Hinzufuegen der Objekte in die TreeMap
        treeDrucker.put(drucker1.getId(), drucker1);
        treeDrucker.put(drucker2.getId(), drucker2);
        treeDrucker.put(drucker3.getId(), drucker3);
        treeDrucker.put(drucker4.getId(), drucker4);

        // Ausgeben aller Objekte der TreeMap
        System.out.println("Ausgabe der TreeMap: ");
        for (Entry<Integer, Aufgabe15Drucker> drucker : treeDrucker.entrySet()) {
            System.out.println(drucker.getValue().toString());
        }
        System.out.println("--------------------------------------------------");

        // Zugriff auf letztes Objekt in TreeMap
        System.out.println("Ausgabe des letzten Objektes der TreeMap: ");
        System.out.println(treeDrucker.get(treeDrucker.lastKey()));
        System.out.println("----------------------------------------------------");

        // Intervall ausgeben
        System.out.println("Intervall von 5 bis 10: ");
        SortedMap<Integer, Aufgabe15Drucker> sm = treeDrucker.subMap(5, 10);
        for (Aufgabe15Drucker drucker : sm.values()) {
            System.out.println(drucker.toString());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("CeilingEntry: " + treeDrucker.ceilingEntry(4).getValue().toString());
    }
}