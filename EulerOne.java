package de.feu.tageins;

public class EulerOne {

	public static void main(String[] args) {
		/*
		 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
		 * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
		 * multiples of 3 or 5 1000.
		 */

		// Zahlen von 1 bis 999 "erzeugen"/durchgehen
		int ergebnis = 0;
		int count = 0;
		for (int i = 1; i < 1000; i++) {
			// entscheiden: Vielfaches von 3 oder 5
			// wenn ja addieren

			if (i % 3 == 0 || i % 5 == 0) {
				ergebnis = ergebnis + i;
				count++;
			}
		}
		// Ergebnis ausgeben 233168
		System.out.println("Ergebnis: " + ergebnis);
		System.out.println("Anzahl Vielfache: " + count);

	}

}
