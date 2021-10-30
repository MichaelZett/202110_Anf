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
		String data = getValidStudentDataFromConsole(sc);
		return data.split(",");
	}

	private static String getValidStudentDataFromConsole(Scanner sc) {
		String data = null;
		while (data == null) {
			System.out.println("Gib Name des Studenten und Fachbereich mit Komma getrennt ein!");
			String rawData = sc.next();
			if (containsOneComma(rawData) && Fachbereich.isValid(rawData.split(",")[1])) {
				data = rawData;
			} else {
				System.out.println("Invalid data!");
			}
		}
		return data;
	}

	private static boolean containsOneComma(String rawData) {
		return rawData.split(",").length == 2;
	}

	@Override
	public void close() {
		sc.close();
	}

}
