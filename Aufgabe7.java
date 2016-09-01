package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe7 {
	public static void main(String[] args) {
		Aufgabe7Konto konto1 = new Aufgabe7Konto();
		konto1.print();
		
		Aufgabe7Konto konto2 = new Aufgabe7Konto("0298765349", 1000);
		konto2.print();
	}
}