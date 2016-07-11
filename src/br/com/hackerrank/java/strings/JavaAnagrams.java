package br.com.hackerrank.java.strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {

		// Complete the function by writing your code here.
		char[] word1 = a.toLowerCase().replaceAll("[\\s]", "").toCharArray();
		char[] word2 = b.toLowerCase().replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return Arrays.equals(word1, word2);

	}

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		String a = scan.next();
//		String b = scan.next();
//		scan.close();
		boolean ret = isAnagram("Hello", "hello");
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
