package de.feu.tagzwei.student;

public class Student {
	private String name;
	private final String matrikelnummer;

	public Student(String name, String matrikelnummer) {
		this.name = name;
		this.matrikelnummer = matrikelnummer;
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public String getMatrikelnummer() {
		return matrikelnummer;
	}

}
