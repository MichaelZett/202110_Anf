package de.feu.tagzwei.student;

import java.util.HashMap;

public class StudentRepository {
	private static int count = 1;
	private static final HashMap<String, Student> VERWALTUNG = new HashMap<>();

	public Student createStudent(String name, String fachbereich) {
		String matrikelnummer = createMatrikelnummer(fachbereich);
		Student student = new Student(name, matrikelnummer);
		VERWALTUNG.put(student.getMatrikelnummer(), student);
		return student;
	}

	private static String createMatrikelnummer(String fachbereich) {
		String matrikelnummer = fachbereich + "0000000" + count;
		count++;
		return matrikelnummer;
	}

}
