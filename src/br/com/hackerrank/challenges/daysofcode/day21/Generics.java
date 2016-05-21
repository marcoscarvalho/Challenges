package br.com.hackerrank.challenges.daysofcode.day21;

public class Generics {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };

		printArray(intArray);
		printArray(stringArray);

		if (Generics.class.getDeclaredMethods().length > 2) {
			System.out
					.println("You should only have 1 method named printArray.");
		}
	}

	public static void printArray(Object array) {
		if (array instanceof Integer[]) {
			Integer[] is = (Integer[]) array;
			for (Integer integer : is) {
				System.out.println(integer);
			}
			
		} else if (array instanceof String[]) {
			String[] is = (String[]) array;
			for (String string : is) {
				System.out.println(string);
			}
		}
	}
}