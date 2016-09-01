package com.tobiasstraub.hfu.treffpunkt.fmud;

public class Aufgabe2 {
	public static void main(String[] args) {
		String content = "";

		do {
			content += 'a';
			System.out.println(content);
		} while (!content.equals("aaaaa"));
	}
}