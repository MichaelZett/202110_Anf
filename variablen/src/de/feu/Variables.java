package de.feu;

public class Variables {

	public static void main(String[] args) {
		String text = "Text";

		String stringZahl = "4";
		int intZahl = Integer.parseInt(stringZahl);
		System.out.println("String zu Zahl " + intZahl);

		String stringZahlFromInt = String.valueOf(intZahl);
		System.out.println("Zahl zu String zu Zahl " + stringZahlFromInt);

		int ganzzahl = Integer.MAX_VALUE; // 2_147_483_647 max

		double maxInt = ganzzahl;
		System.out.println("MaxInt " + maxInt);

		long grosseGanzzahl = 2_147_483_648L;
		Long wrapperLong = Long.valueOf(5);
		grosseGanzzahl = wrapperLong;
		wrapperLong = grosseGanzzahl;

		float kleinFliesspunkt = 2.0F;
		double fliesspunkt = 3.5;
		System.out.println("Fliess " + fliesspunkt);
		int fehlWas = (int) fliesspunkt;
		System.out.println("Ganz " + fehlWas);

		boolean logisch = true;

		char buchstaben = 'c';
	}

}
