package de.feu.tagzwei.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtils {

	public static int getNumberFromConsole(Scanner sc) {
		Integer number = null;
		while (number == null) {
			try {
				number = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(sc.next() + " ist Keine Zahl, nochmal bitte!");
			}
		}
		return number;
	}

}
