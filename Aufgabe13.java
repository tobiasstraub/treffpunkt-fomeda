package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.HashMap;

public class Aufgabe13 {
	public static void main(String[] args) {
		HashMap<Integer, Aufgabe13Mitarbeiter> mitarbeiter = new HashMap<Integer, Aufgabe13Mitarbeiter>();

		Aufgabe13Mitarbeiter m1 = new Aufgabe13Mitarbeiter(12343, "Hans");
		Aufgabe13Mitarbeiter m2 = new Aufgabe13Mitarbeiter(62732, "Rudolph");

		mitarbeiter.put(12343, m1);
		mitarbeiter.put(62732, m2);

		for (Aufgabe13Mitarbeiter m : mitarbeiter.values()) {
			System.out.println(m);
		}

		System.out.print("\n"); // Zeilenumbruch fuer eine gruppiertere Ausgabe
								// :-)

		for (int personalNr : mitarbeiter.keySet()) {
			System.out.println(mitarbeiter.get(personalNr));
		}
	}
}