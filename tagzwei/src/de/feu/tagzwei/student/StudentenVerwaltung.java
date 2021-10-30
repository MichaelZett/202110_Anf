package de.feu.tagzwei.student;

public class StudentenVerwaltung {
	private static final String FB_WINF = "WIN";
	private static final String FB_INF = "INF";

	public static void main(String[] args) {
		StudentRepository repo = new StudentRepository();

		StudentUi ui = new StudentUi();
		String[] data = ui.getStudentData();

		Student peter = repo.createStudent(data[0], data[1]);

		Student marie = repo.createStudent("Marie", FB_INF);

		System.out.println(peter);
		System.out.println(marie);
	}

}
