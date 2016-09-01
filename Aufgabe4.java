package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe4 {
	public static void main(String[] args) {
		// Variante 1
		char[] awesomeArray1 = new char[5];
		awesomeArray1[0] = 'H';
		awesomeArray1[1] = 'a';
		awesomeArray1[2] = 'l';
		awesomeArray1[3] = 'l';
		awesomeArray1[4] = 'o';

		// Ausgabe Variante 1
		for (int i = 0; i < awesomeArray1.length; i++) {
			System.out.print(awesomeArray1[i]);
		}

		System.out.print("\n"); // Neue Zeile für Variante 2

		// Variante 2 (Alternative)
		char[] awesomeArray2 = { 'H', 'a', 'l', 'l', 'o' };

		// Ausgabe Variante 2
		for (int i = 0; i < awesomeArray2.length; i++) {
			System.out.print(awesomeArray2[i]);
		}
	}
}