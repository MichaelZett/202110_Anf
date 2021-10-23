package de.feu.tageins;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SetsAndMaps {

	public static void main(String[] args) {
		// Liste = Ordnung, doppelte erlaubt
		LinkedList<String> list = new LinkedList<>();

		list.add("Peter");
		list.add("Marie");
		list.add("Marie");

		list.forEach(System.out::println);
		System.out.println("--------------------------");

		// Set = Menge = keine Ordnung, jedes Element nur ein mal

		Set<String> set = list.stream().collect(Collectors.toSet());
		set.forEach(System.out::println);

		System.out.println("--------------------------");
		HashMap<String, String> map = new HashMap<>();

		map.put("Peter", "0123-4657859");
		map.put("Marie", "0178-9364849");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "s Nummer ist: " + entry.getValue());
		}
	}

}
