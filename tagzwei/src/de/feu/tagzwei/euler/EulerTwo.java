package de.feu.tagzwei.euler;

public class EulerTwo {

	public static void main(String[] args) {
		int sum = 0;
		int oldOld = 1;
		int old = 2;
		while (old <= 4_000_000) {
			if (old % 2 == 0) {
				sum = sum + old;
			}
			int value = oldOld + old;
			oldOld = old;
			old = value;
		}
		System.out.println("Ergebnis: " + sum);

	}

}
