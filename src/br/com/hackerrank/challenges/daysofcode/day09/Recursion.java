package br.com.hackerrank.challenges.daysofcode.day09;

import java.io.InputStream;
import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		new Recursion().execute();
	}

	private InputStream systemIn;

	public Recursion() {
		this(System.in);
	}

	public Recursion(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);
		int n = in.nextInt();
		in.close();

		System.out.println(factorial(n));
	}

	private int factorial(int n) {

		if (n >= 2 && n <= 12)
			return factorial(n - 1) * n;
		else
			return n;
	}

}
