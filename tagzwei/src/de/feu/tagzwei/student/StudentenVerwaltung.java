package de.feu.tagzwei.student;

public class StudentenVerwaltung {
	private static final String FB_WINF = "WIN";
	private static final String FB_INF = "INF";

	public static void main(String[] args) {
		StudentRepository repo = new StudentRepository();
		try (StudentUi ui = new StudentUi()) {
			String[] data = ui.getStudentData();

			Student peter = repo.createStudent(data[0], data[1]);

			data = ui.getStudentData();

			Student marie = repo.createStudent(data[0], data[1]);

			System.out.println(peter);
			System.out.println(marie);
		}
	}

}
