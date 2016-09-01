package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe8Konto {
	private String kontonr;
	private long kontostandInCent;
	
	Aufgabe8Konto() {
		kontonr = null;
		kontostandInCent = 0;
	}
	
	Aufgabe8Konto(String kontonr, int kontostandInCent) {
		this.kontonr = kontonr;
		this.kontostandInCent = kontostandInCent;
	}
	
	public void print() {
		System.out.print("Das Konto mir der Kontonummer " + kontonr + " hat einen Kontostand von " + kontostandInCent + " Cent Euro.");
	}
}