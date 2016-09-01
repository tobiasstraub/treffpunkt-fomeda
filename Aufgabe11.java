package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.LinkedList;

public class Aufgabe11 {
	public static void main(String[] args) {
		LinkedList<Aufgabe11Mitarbeiter> mitarbeiter = new LinkedList<Aufgabe11Mitarbeiter>();

		Aufgabe11Mitarbeiter m1 = new Aufgabe11Mitarbeiter(12343, "Hans");
		Aufgabe11Mitarbeiter m2 = new Aufgabe11Mitarbeiter(62732, "Rudolph");

		mitarbeiter.add(m1);
		mitarbeiter.add(m2);

		mitarbeiter.get(0).print();
		mitarbeiter.get(1).print();
	}
}