package de.feu.tagzwei.student;

import java.util.Objects;

public class Student extends AbstractPerson {
	private final String matrikelnummer;

	public Student(String name, String matrikelnummer) {
		super(name);
		this.matrikelnummer = matrikelnummer;
	}

	public String getMatrikelnummer() {
		return this.matrikelnummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matrikelnummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(matrikelnummer, other.matrikelnummer);
	}

	@Override
	public String toString() {
		return "Student [matrikelnummer=" + this.matrikelnummer + ", name=" + this.name + "]";
	}

}
