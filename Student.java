package de.feu.tageins;

public class Student {
	private static int count = 0;

	private String name;
	private String matrikelnummer;

	public static int getCount() {
		return count;
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

	void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
		count++;
	}

}
