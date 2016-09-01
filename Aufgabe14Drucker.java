package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe14Drucker {
    private String druckerTyp;
    private int id;
    private String herstellername;

    public Aufgabe14Drucker() {
    }

    public Aufgabe14Drucker(String druckerTyp, String name, int id) {
        this.druckerTyp = druckerTyp;
        herstellername = name;
        this.id = id;
    }

    public String getDruckerTyp() {
        return druckerTyp;
    }

    public void setDruckerTyp(String druckerTyp) {
        this.druckerTyp = druckerTyp;
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
}