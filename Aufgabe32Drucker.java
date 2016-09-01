package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe32Drucker {
    private String art;
    private String seriennummer;
    private String hersteller;

    public Aufgabe32Drucker(String art, String seriennummer, String hersteller) {
        this.art = art;
        this.seriennummer = seriennummer;
        this.hersteller = hersteller;
    }

    public String getArt() {
        return art;
    }

    public String getSeriennummer() {
        return seriennummer;
    }

    public String getHersteller() {
        return hersteller;
    }

    @Override
    public String toString() {
        return "Art: " + art + "\nSeriennummer: " + seriennummer + "\nHersteller: " + hersteller;
    }

    public int compareTo(Aufgabe32Drucker toEqualObj) {
        return seriennummer.compareTo(toEqualObj.seriennummer);
    }
}