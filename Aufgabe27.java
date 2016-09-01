package com.tobiasstraub.hfu.treffpunkt.fmud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Aufgabe27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Bitte geben Sie eine Postleitzahl an: ");
            if(Pattern.matches("^[0-9]{5}$", sc.nextLine())) {
                System.out.print("Das war korrekt!");
                System.exit(0);
            }
            System.out.print("Das war leider nicht korrekt. ");
        } while(true);
    }
}