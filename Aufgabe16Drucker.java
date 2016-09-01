package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe16Drucker implements Comparable<Aufgabe16Drucker> {
    private String druckerTyp;
    private int id;
    private String herstellername;

    public Aufgabe16Drucker() {
    }

    public Aufgabe16Drucker(String typ, String name, int id) {
        this.druckerTyp = typ;
        herstellername = name;
        this.id = id;
    }

    public String getDruckerTyp() {
        return druckerTyp;
    }

    public void setDruckerTyp(String typ) {
        this.druckerTyp = typ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHerstellername() {
        return herstellername;
    }

    public void setHerstellername(String herstellername) {
        this.herstellername = herstellername;
    }

    @Override
    public String toString() {
        return "\nID: " + id + " Typ: " + druckerTyp + " Herstellername: " + herstellername;
    }

    @Override
    public int compareTo(Aufgabe16Drucker o) {
        return id - o.id;
    }
}