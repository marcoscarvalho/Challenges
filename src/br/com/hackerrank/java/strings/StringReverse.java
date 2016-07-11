package br.com.hackerrank.java.strings;



public class StringReverse {

	public static void main(String[] args) {
		boolean ret = isPalindrome("madam");
		System.out.println((ret) ? "Yes" : "No");

	}
	
	static boolean isPalindrome(String a) {
		
		
		char[] word = a.toLowerCase().replaceAll("[\\s]", "").toCharArray();
		
		for (int i = 0; i < word.length; i++) {
			char a1 = word[i] ;
			char a2 = word[word.length - i - 1];
			if(a1 != a2) {
				return false;
			}
		}
		
		return true;
	}

}
