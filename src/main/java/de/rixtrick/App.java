package de.rixtrick;

import java.util.UUID;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Unique ID: " + generateUniqueKey());
	}

	public static String generateUniqueKey() {

		String id = UUID.randomUUID().toString();
		return id;
	}
}
