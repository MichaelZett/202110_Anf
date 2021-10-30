package de.feu.tagzwei.student;

import java.io.Closeable;
import java.util.Scanner;

public class StudentUi implements Closeable {
	private static final String FB_WINF = "WIN";
	private static final String FB_INF = "INF";
	private Scanner sc;

	public StudentUi() {
		super();
		sc = new Scanner(System.in);
	}

	public String[] getStudentData() {
		String data = getValidStudentDataFromConsole(sc);
		return data.split(",");
	}

	private static String getValidStudentDataFromConsole(Scanner sc) {
		String data = null;
		while (data == null) {
			System.out.println("Gib Name des Studenten und Fachbereich mit Komma getrennt ein!");
			String rawData = sc.next();
			if (containsOneComma(rawData) && isValidFachbereich(rawData)) {
				data = rawData;
			} else {
				System.out.println("Invalid data!");
			}
		}
		return data;
	}

	private static boolean isValidFachbereich(String rawData) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean containsOneComma(String rawData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close() {
		sc.close();
	}

}
