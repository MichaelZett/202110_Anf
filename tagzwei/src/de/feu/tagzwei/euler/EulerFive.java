package de.feu.tagzwei.euler;

public class EulerFive {

	public static void main(String[] args) {
		int i = 20;
		while (true) {
			if (divisableUpTo20(i)) {
				break;
			}
			i = i + 20;
		}
		System.out.println("Ergebnis: " + i);
	}

	private static boolean divisableUpTo20(int number) {
		for (int i = 2; i <= 20; i++) {
			if (number % i != 0) {
				return false;
			}
		}
		return true;
	}
}
