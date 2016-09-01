package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe11Mitarbeiter {
	private int personalNr;
	private String name;

	public Aufgabe11Mitarbeiter(int personalNr, String name) {
		this.personalNr = personalNr;
		this.name = name;
	}

	public void print() {
		System.out.println(
				"Der Mitarbeiter hat die Personalnummer " + personalNr + " und traegt den Namen " + name + ".");
	}
}