package br.com.hackerrank.challenges.daysofcode.day16;

import java.io.InputStream;
import java.util.Scanner;

public class ExceptionsStringToInteger {

	private InputStream systemIn;

	public ExceptionsStringToInteger() {
		this(System.in);
	}

	public ExceptionsStringToInteger(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new ExceptionsStringToInteger().execute();
	}

	public void execute() {

		Scanner sc = new Scanner(systemIn);
		String S = sc.next();
		
		try {
			System.out.println(Integer.parseInt(S));
		}catch (Exception e) {
			System.out.println("Bad String");
		}
		sc.close();
	}

}