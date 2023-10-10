package Challenge_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		changeChar();
		// matrixReverse1();
		// matrixReverse2();
		// removeSameChars();
	}

	static void changeChar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Kelime: ");
		String word = input.nextLine();

		char[] vowels = { 'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü' };
		String newWord = "";

		for (int i = 0; i < word.length(); i++) {
			char wordCharacter = word.charAt(i);
			int index = -1;

			for (int j = 0; j < vowels.length; j++) {
				if (vowels[j] == wordCharacter) {
					index = j;
					break;
				}
			}

			if (index != -1)
				newWord += (index + 1);
			else
				newWord += wordCharacter;

		}

		System.out.println(newWord);
	}

	static void matrixReverse1() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] newMatrix = new int[matrix.length][matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				newMatrix[i][j] = matrix[matrix.length - 1 - i][matrix[0].length - 1 - j];
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void matrixReverse2() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] newMatrix = new int[matrix.length][matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				newMatrix[i][j] = matrix[matrix.length - 1 - j][i];
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void removeSameChars() {
		Scanner input = new Scanner(System.in);

		System.out.print("Kelime: ");
		String word = input.nextLine();

		System.out.print("Sayı: ");
		int n = input.nextInt();

		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) == character) {
					count++;
				}
			}
			if (count < n)
				newWord += character;
		}
		System.out.println(newWord);
	}

}

