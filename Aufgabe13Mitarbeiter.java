package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe13Mitarbeiter {
	private int personalNr;
	private String name;

	public Aufgabe13Mitarbeiter(int personalNr, String name) {
		this.personalNr = personalNr;
		this.name = name;
	}

	public String toString() {
		return "Der Mitarbeiter hat die Personalnummer " + personalNr + " und traegt den Namen " + name + ".";
	}
}