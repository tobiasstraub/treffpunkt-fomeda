package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Aufgabe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Aufgabe16Drucker> treeDrucker = new TreeMap<Integer, Aufgabe16Drucker>();

        Aufgabe16Drucker drucker1 = new Aufgabe16Drucker();
        Aufgabe16Drucker drucker2 = new Aufgabe16Drucker();
        Aufgabe16Drucker drucker3 = new Aufgabe16Drucker();
        Aufgabe16Drucker drucker4 = new Aufgabe16Drucker("Laserdrucker", "hp", 5);

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

        //Hinzufuegen der Objekte in die TreeMap
        treeDrucker.put(drucker1.getId(), drucker1);
        treeDrucker.put(drucker2.getId(), drucker2);
        treeDrucker.put(drucker3.getId(), drucker3);
        treeDrucker.put(drucker4.getId(), drucker4);

        //Ausgeben aller Objekte der TreeMap
        System.out.println("Ausgabe der TreeMap: ");
        for (Entry<Integer, Aufgabe16Drucker> drucker : treeDrucker.entrySet()) {
            System.out.println(drucker.getValue().toString());
        }
        System.out.println("--------------------------------------------------");

        //Zugriff auf letztes Objekt in TreeMap
        System.out.println("Ausgabe des letzten Objektes der TreeMap: ");
        System.out.println(treeDrucker.get(treeDrucker.lastKey()));
        System.out.println("----------------------------------------------------");

        //Intervall ausgeben
        System.out.println("Intervall von 5 bis 10: ");
        SortedMap<Integer, Aufgabe16Drucker> sm = treeDrucker.subMap(5, 10);
        for (Aufgabe16Drucker druck : sm.values()) {
            System.out.println(druck.toString());
        }
        System.out.println("----------------------------------------------------");


        ArrayList<Aufgabe16Drucker> arrayListDrucker = new ArrayList<Aufgabe16Drucker>(treeDrucker.values());

        // aufsteigende Reihenfolge
        System.out.println("aufsteigende Reihenfolge: ");
        Collections.sort(arrayListDrucker);
        for (Aufgabe16Drucker drucker : arrayListDrucker) {
            System.out.println(drucker.toString());
        }
        System.out.println("\n");

        // absteigende Reihenfolge
        System.out.println("absteigende Reihenfolge: ");
        Collections.sort(arrayListDrucker, Collections.reverseOrder());
        for (Aufgabe16Drucker drucker : arrayListDrucker) {
            System.out.println(drucker.toString());
        }
        System.out.println("----------------------------");

        System.out.println("CeilingEntry: " + treeDrucker.ceilingEntry(4).getValue().toString());
    }
}