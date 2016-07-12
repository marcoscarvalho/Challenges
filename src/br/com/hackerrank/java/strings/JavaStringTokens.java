package br.com.hackerrank.java.strings;

import java.util.regex.Pattern;

public class JavaStringTokens {

	public static void main(String[] args) {
		String s = "He is a very very good boy, isn't he?";
		
		//Pattern p = Pattern.compile("[A-Za-z !,?._'@]");
		//String[] ss = p.split(s);
		
		String[] ss = s.split("[ .,?!']+");
		
		System.out.println(ss.length);
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
	}

}
