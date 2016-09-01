package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe8 {
	public static void main(String[] args) {
		Aufgabe8Sparkonto konto1 = new Aufgabe8Sparkonto();
		konto1.print();
		
		Aufgabe8Sparkonto konto2 = new Aufgabe8Sparkonto("0298765349", 1000, 0.12345);
		konto2.print();
	}
}