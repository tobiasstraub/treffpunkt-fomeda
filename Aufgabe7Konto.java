package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe7Konto {
	private String kontonr;
	private long kontostandInCent;
	
	Aufgabe7Konto() {
		kontonr = null;
		kontostandInCent = 0;
	}
	
	Aufgabe7Konto(String kontonr, int kontostandInCent) {
		this.kontonr = kontonr;
		this.kontostandInCent = kontostandInCent;
	}
	
	public void print() {
		System.out.println("Das Konto mir der Kontonummer " + kontonr + " hat einen Kontostand von " + kontostandInCent + " Cent Euro.");
	}
}