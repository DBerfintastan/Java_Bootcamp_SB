package Challenge_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input: ");
		String input = scanner.nextLine();
		//count(input);
		//zipzop(input);
		replace(input);
	}

	private static void count(String input) {

		LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

		for (char character : input.toLowerCase().toCharArray()) {
			if (charCount.containsKey(character)) {
				charCount.put(character, charCount.get(character) + 1);
			} else
				charCount.put(character, 1);
		}
		for (HashMap.Entry<Character, Integer> entry : charCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	private static void zipzop(String input) {

		ArrayList<Character> harfler = new ArrayList<>();

		for (char character : input.toCharArray()) {
			if (!harfler.contains(character)) {
				harfler.add(character);
				System.out.print(character);
			}
		}
	}

	private static void replace(String input) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Neyi: ");
		String oldChar = scanner.nextLine();
		System.out.print("Neyle: ");
		String newChar = scanner.nextLine();

		HashMap<Character, Character> map = new HashMap<>();

		for (int i = 0; i < oldChar.length(); i++) {
			map.put(oldChar.charAt(i), newChar.charAt(i));
		}

		StringBuilder newWord = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char character = input.charAt(i);
			if (map.containsKey(character)) {
				newWord.append(map.get(character));
			} else {
				newWord.append(character);
			}
		}

		System.err.println(newWord.toString());

	}


}
