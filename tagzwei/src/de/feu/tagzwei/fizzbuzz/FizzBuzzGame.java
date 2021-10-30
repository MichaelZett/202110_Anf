package de.feu.tagzwei.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzzGame {

	public static void main(String[] args) {
//		doFizzBuzz();
		fizzBuzzStreams();
	}

	private static void doFizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(determineWord(i));
			if (i < 100) {
				System.out.print(", ");
			}
		}
	}

	private static String determineWord(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(number);
		}
	}

	private static void fizzBuzzStreams() {
		IntStream.rangeClosed(1, 100).mapToObj(i -> determineWord(i) + addPossibleComma(i)).forEach(System.out::print);
	}

	private static String addPossibleComma(int i) {
		return (i < 100) ? "," : "";
	}

}