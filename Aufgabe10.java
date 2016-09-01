package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.ArrayList;

public class Aufgabe10 {
	public static void main(String[] args) {
		ArrayList<Aufgabe10Mitarbeiter> mitarbeiter = new ArrayList<Aufgabe10Mitarbeiter>();

		Aufgabe10Mitarbeiter m1 = new Aufgabe10Mitarbeiter(12343, "Hans");
		Aufgabe10Mitarbeiter m2 = new Aufgabe10Mitarbeiter(62732, "Rudolph");

		mitarbeiter.add(m1);
		mitarbeiter.add(m2);

		mitarbeiter.get(0).print();
		mitarbeiter.get(1).print();
	}
}