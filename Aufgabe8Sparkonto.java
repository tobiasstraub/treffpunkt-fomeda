package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe8Sparkonto extends Aufgabe8Konto {
	private double zinssatz;
	
	Aufgabe8Sparkonto() {
		super();
		zinssatz = 2.578211;
	}
	
	Aufgabe8Sparkonto(String kontonr, int kontostandInCent, double zinssatz) {
		super(kontonr, kontostandInCent);
		this.zinssatz = zinssatz;
	}
	
	public void print() {
		super.print();
		System.out.println(" Der Zinssatz betraegt " + zinssatz + "%.");
	}
}