package helloworld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Enter your name!");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String text = "Hello, " + name;

		System.out.println(text);
		scanner.close();
	}

}
