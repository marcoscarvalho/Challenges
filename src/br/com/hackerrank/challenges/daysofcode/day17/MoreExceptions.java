package br.com.hackerrank.challenges.daysofcode.day17;

import java.io.InputStream;
import java.util.Scanner;

public class MoreExceptions {

	private InputStream systemIn;

	public MoreExceptions() {
		this(System.in);
	}

	public MoreExceptions(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new MoreExceptions().execute();
	}

	public void execute() {

		Scanner in = new Scanner(systemIn);
		int T = in.nextInt();
		while (T-- > 0) {
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}

}

class Calculator {

	public int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}
		return (int) Math.pow(n,p);
	}
}