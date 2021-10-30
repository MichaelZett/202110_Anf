package de.feu.tagzwei.student;

public class Student {
	private final String matrikelnummer;
	private String name;

	public Student(String name, String matrikelnummer) {
		this.name = name;
		this.matrikelnummer = matrikelnummer;
	}

	public String getName() {
		return name;
	}

	void updateName(String name) {
		this.name = name;
	}

	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	@Override
	public String toString() {
		return "Student [matrikelnummer=" + matrikelnummer + ", name=" + name + "]";
	}

}
