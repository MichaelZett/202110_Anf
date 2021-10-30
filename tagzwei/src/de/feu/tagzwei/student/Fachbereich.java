package de.feu.tagzwei.student;

public enum Fachbereich {
	WINF("WIN", "Wirtschaftsinformatik"), INF("INF", "Informatik");

	private String matrikelRep;
	private String text;

	Fachbereich(String matrikelRep, String text) {
		this.matrikelRep = matrikelRep;
		this.text = text;
	}

	public String getMatrikelRep() {
		return matrikelRep;
	}

	public String getText() {
		return text;
	}

	static boolean isValid(String string) {

		return false;
	}

}
