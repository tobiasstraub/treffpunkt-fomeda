package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.Comparator;

public class Aufgabe19ComparatorHandler implements Comparator<Aufgabe19Person> {
    @Override
    public int compare(Aufgabe19Person o1, Aufgabe19Person o2) {
        if (o1.getAlter() == o2.getAlter()) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getAlter() - o2.getAlter();
        }
    }
}