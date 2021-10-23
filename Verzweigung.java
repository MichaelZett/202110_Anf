package de.feu.tageins;

public class Verzweigung {

	public static void main(String[] args) {
		int zahl = 7;

		if (zahl < 10) {
			System.out.println("Zahl ist kleiner 10.");
		} else if (zahl >= 10 && zahl < 100) {
			System.out.println("Zahl ist größer gleich 10 und kleiner 100");
		} else {
			System.out.println("Zahl ist größer gleich 100.");
		}

		switch (zahl) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8: {
			System.out.println("Zahl ist vier bis 8.");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + zahl);
		}

	}

}
