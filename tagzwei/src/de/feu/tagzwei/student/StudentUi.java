package de.feu.tagzwei.student;

import java.io.Closeable;
import java.util.Scanner;

public class StudentUi implements Closeable {
	private Scanner sc;

	public StudentUi() {
		super();
		sc = new Scanner(System.in);
	}

	public String[] getStudentData() {
		System.out.println("Gib Name des Studenten und Fachbereich mit Komma getrennt ein!");
		String data = sc.next();
		return data.split(",");
	}

	@Override
	public void close() {
		sc.close();
	}

}
