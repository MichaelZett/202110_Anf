package de.feu.tagzwei.calc;

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
	}

	private static void doCalculating(Scanner sc) {
		System.out.println("Gib eine Zahl ein!");
		int zahl1 = ConsoleUtils.getNumberFromConsole(sc);

		System.out.println("Gib noch eine Zahl ein!");

		int zahl2 = ConsoleUtils.getNumberFromConsole(sc);
		System.out.println("Das Ergebnis lautet " + (zahl1 + zahl2));
	}

}
