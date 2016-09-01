package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe5 {
	public static void main(String[] args) {
		// Variante 1
		char[] awesomeArray1 = new char[5];
		awesomeArray1[0] = 'H';
		awesomeArray1[1] = 'a';
		awesomeArray1[2] = 'l';
		awesomeArray1[3] = 'l';
		awesomeArray1[4] = 'o';

		// Ausgabe Variante 1
		for (char element : awesomeArray1) {
			System.out.print(element);
		}

		System.out.print("\n"); // Neue Zeile für Variante 2

		// Variante 2 (Alternative)
		char[] awesomeArray2 = { 'H', 'a', 'l', 'l', 'o' };

		// Ausgabe Variante 2
		for (char element : awesomeArray2) {
			System.out.print(element);
		}
	}
}