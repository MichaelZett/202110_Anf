package de.feu.tageins;

public class Dreieck {

	public static void main(String[] args) {
		// äußere Schleife für Zeilennummer und -umburch
		for (int i = 1; i < 6; i++) {
			// innere Schleife für Spaltenanzahl und Ausgabe
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
