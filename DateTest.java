package de.feu.tageins;

public class DateTest {

	public static void main(String[] args) {
		System.out.println("1900: " + DateUtils.isSchaltjahr(1900));
		System.out.println("2000: " + DateUtils.isSchaltjahr(2000));
		System.out.println("2012: " + DateUtils.isSchaltjahr(2012));
		System.out.println("2021: " + DateUtils.isSchaltjahr(2021));

	}

}
