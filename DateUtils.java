package de.feu.tageins;

public class DateUtils {

	public static boolean isSchaltjahr(int year) {
		boolean divisableBy400 = year % 400 == 0;
		boolean divisableBy4 = year % 4 == 0;
		boolean notDivisableBy100 = year % 100 != 0;

		return divisableBy400 || divisableBy4 && notDivisableBy100;
	}

}
