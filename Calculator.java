package de.feu.tageins;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Aufgabe
		// Lass 2 Zahlen nacheinander über die Konsole eingeben
		// Gib deren Summe auf der Konsole aus
		// Hinweise: Scanner, ggf. Konvertieren
		// try with resources
		try (Scanner sc = new Scanner(System.in)) {
			doCalculating(sc);
		}

		// vor java 7
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			doCalculating(sc);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

	private static void doCalculating(Scanner sc) {
		System.out.println("Gib eine Zahl ein!");
		int zahl1 = sc.nextInt();

		System.out.println("Gib noch eine Zahl ein!");

		int zahl2 = 0;
		try {
			zahl2 = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(sc.next() + " ist Keine Zahl, nochmal bitte!");
			zahl2 = sc.nextInt();
		}
		System.out.println("Das Ergebnis lautet " + (zahl1 + zahl2));
	}

}
