package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe6 {
	public static void main(String[] args) {
		int zahl = 0;
		while(true) {
			zahl++;
			
			if(zahl > 20) break;
			if(zahl == 10) continue;
			
			System.out.println(zahl);
		}
	}
}