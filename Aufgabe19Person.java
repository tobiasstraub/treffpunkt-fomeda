package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe19Person implements Comparable<Aufgabe19Person> {
    private String name;
    private int alter;

    public Aufgabe19Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public int compareTo(Aufgabe19Person o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t" + "Alter: " + alter;
    }
}