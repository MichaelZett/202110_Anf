package de.feu.tagzwei.student;

public class StudentenVerwaltung {

	public static void main(String[] args) {
		StudentRepository repo = new StudentRepository();
		try (StudentUi ui = new StudentUi()) {
			AbstractPerson pers = new AbstractPerson("Peter") {
				// anonyme Klasse erzeugt (StudentenVerwaltung$1), Kann instantiiert werden
			};

			String[] data = ui.getStudentData();

			AbstractPerson peter = repo.createStudent(data[0], data[1]);
			peter.getName();
			Student studentPeter = (Student) peter;
			studentPeter.getMatrikelnummer();
			HasName michael = new Dozent("Michael");

			print(peter);
			print(michael);

//			data = ui.getStudentData();
//
//			HasName marie = repo.createStudent(data[0], data[1]);

//			System.out.println(peter);
//			System.out.println(marie);
		}
	}

	private static void print(HasName hasName) {
		System.out.println(hasName);
		if (hasName instanceof Student) {
			System.out.println("Hey, das ist ja ein Student!");
		}
	}

}
