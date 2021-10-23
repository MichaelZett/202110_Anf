package de.feu.tageins;

import java.util.Iterator;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		LinkedList<Integer> zahlen = new LinkedList<>();
		zahlen.add(7);
		zahlen.add(Integer.valueOf(23));
		zahlen.add(123);

		// alte for-Schleife
		for (int i = 0; i < zahlen.size(); i++) {
			System.out.println("Wert bei " + i + " ist " + zahlen.get(i));
		}
		System.out.println("-------------------------");
		// neue for-Schleife "for-each"
		for (Integer integer : zahlen) {
			System.out.println("Wert " + integer);
		}
		System.out.println("-------------------------");
		// streams, lambda, foreach
		zahlen.forEach(z -> System.out.println(z));

		Iterator<Integer> it = zahlen.iterator();
		while (it.hasNext()) {
			System.out.println("Wert " + it.next());
		}
		System.out.println("-------------------------");

		int i = 0;
		while (i <= 9) {
			System.out.println("I ist " + i);
			i++;
		}
		System.out.println("-------------------------");
		int j = 0;
		do {
			System.out.println("J ist " + j);
			j++;
		} while (j <= 9);
	}

}
