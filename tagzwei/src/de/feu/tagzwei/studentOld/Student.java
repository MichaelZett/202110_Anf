package de.feu.tagzwei.studentOld;

public class Student {
	private static final String FB_WINF = "WINF";
	private static final String FB_INF = "INF";
	private static int count = 1;

	private String name;
	private String matrikelnummer;

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
		this.matrikelnummer = FB_WINF + "0000000" + count;
		count++;
	}

	public String getMatrikelnummer() {
		return matrikelnummer;
	}

}
