package de.feu.tagzwei.student;

public class StudentenVerwaltung {
	private static final String FB_WINF = "WINF";
	private static final String FB_INF = "INF";

	public static void main(String[] args) {
		StudentRepository repo = new StudentRepository();

		Student peter = repo.createStudent("peter", FB_WINF);

		Student marie = repo.createStudent("Marie", FB_INF);

		System.out.println(peter);
		System.out.println(marie);
	}

}
