package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.HashMap;

public class Aufgabe12 {
	public static void main(String[] args) {
		HashMap<Integer, Aufgabe12Mitarbeiter> mitarbeiter = new HashMap<Integer, Aufgabe12Mitarbeiter>();

		Aufgabe12Mitarbeiter m1 = new Aufgabe12Mitarbeiter(12343, "Hans");
		Aufgabe12Mitarbeiter m2 = new Aufgabe12Mitarbeiter(62732, "Rudolph");

		mitarbeiter.put(12343, m1);
		mitarbeiter.put(62732, m2);

		mitarbeiter.get(12343).print();
		mitarbeiter.get(62732).print();
	}
}