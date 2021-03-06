package de.feu.tagzwei.studentOld;

import java.util.HashMap;

public class StudentenVerwaltung {
	public static void main(String[] args) {
		HashMap<String, Student> verwaltung = new HashMap<>();

		Student peter = new Student();
		peter.setName("Peter");

		verwaltung.put(peter.getMatrikelnummer(), peter);

		System.out.println(peter.getMatrikelnummer());

		Student marie = new Student();
		marie.setName("Marie");

		verwaltung.put(marie.getMatrikelnummer(), marie);

		System.out.println(marie.getMatrikelnummer());

		System.out.println("Vorher: " + marie.getName());
		writeToStudent(marie);
		System.out.println("Nachher: " + marie.getName());
	}

	private static void writeToStudent(Student marie) {
		// write a letter
		marie.setName("Hackeranriff");
	}

	private static void stringsAlwaysWithEquals() {
		int zahl = 5;
		int zahl2 = 7;
		System.out.println(zahl == zahl2);
		System.out.println("Peter".equals("Marie"));
	}
}
