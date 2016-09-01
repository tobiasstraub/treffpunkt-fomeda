package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe31Drucker {
    private String art;
    private String seriennummer;
    private String hersteller;

    public Aufgabe31Drucker(String art, String seriennummer, String hersteller) {
        this.art = art;
        this.seriennummer = seriennummer;
        this.hersteller = hersteller;
    }

    @Override
    public String toString() {
        return "Art: " + art + "\nSeriennummer: " + seriennummer + "\nHersteller: " + hersteller;
    }
}