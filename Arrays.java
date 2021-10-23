package de.feu.tageins;

public class Arrays {

	public static void main(String[] args) {
		int[] zahlen = new int[5];

		Integer[] zahlenWrapper = new Integer[5];

		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = i * i;
			zahlenWrapper[i] = i * i;
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Wert bei " + i + " ist " + zahlen[i]);
		}
		System.out.println("--------------------------------");
		for (int i = 0; i < zahlenWrapper.length; i++) {
			System.out.println("Wert bei " + i + " ist " + zahlenWrapper[i]);
		}

	}

}
