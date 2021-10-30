package de.feu.tagzwei.student;

public enum Fachbereich {
	WINF("WIN", "Wirtschaftsinformatik"), INF("INF", "Informatik"), //
	BWL("BWL", "Betriebswirtschaftslehre");

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

	public static boolean isValid(String string) {
		Fachbereich[] values = values();
		for (int i = 0; i < values.length; i++) {
			if (values[i].matrikelRep.equals(string)) {
				return true;
			}
		}
		return false;
	}

}
