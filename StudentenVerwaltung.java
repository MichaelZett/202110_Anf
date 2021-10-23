package de.feu.tageins;

import java.util.HashMap;

public class StudentenVerwaltung {
	private static final String KONSTANTE = "Konstante";

	public static void main(String[] args) {
		HashMap<String, Student> verwaltung = new HashMap<>();

		Student peter = new Student();
		peter.setName("Peter");
		peter.setMatrikelnummer("123345");

		verwaltung.put(peter.getMatrikelnummer(), peter);

		System.out.println(Student.getCount());

		Student marie = new Student();
		marie.setName("Marie");
		marie.setMatrikelnummer("123346");

		verwaltung.put(marie.getMatrikelnummer(), marie);

		System.out.println(Student.getCount());
	}

}
