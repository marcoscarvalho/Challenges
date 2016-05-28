package br.com.hackerrank.challenges.daysofcode.day29;

import java.io.InputStream;
import java.util.Scanner;

public class BitwiseAND {

	private InputStream systemIn;

	public BitwiseAND() {
		this(System.in);
	}

	public BitwiseAND(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new BitwiseAND().execute();
	}

	public void execute() {

		Scanner sc = new Scanner(systemIn);

		int scenarios = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < scenarios; i++) {

			int n = sc.nextInt();
			int k = sc.nextInt();

			int result = 0;
			for (int A = 1; A <= n; A++) {
				for (int B = A + 1; B <= n; B++) {
					int current = A & B;
					if (current > result && current < k) {
						result = current;
					}
				}
			}

			System.out.println(result);
		}

		sc.close();
	}

}