package br.com.hackerrank.challenges.daysofcode.day10;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		new BinaryNumbers().execute();
	}

	private InputStream systemIn;

	public BinaryNumbers() {
		this(System.in);
	}

	public BinaryNumbers(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);
		int n = in.nextInt();

		System.out.println(getMaxOfBinary(n));

		in.close();
	}

	private int getMaxOfBinary(int i) {
		int max = 0;
		ArrayList<Integer> tempMax = new ArrayList<Integer>();
//		int currentmax = 0;
		boolean stop = true;
		while (stop) {
			if (i % 2 == 1) {
				max++;
			}
			if (i % 2 == 0 || i == 1) {
				tempMax.add(max);
				max = 0;
			}
			if (i == 1) {
				stop = false;
			}
			i = i / 2;
		}
		return Collections.max(tempMax);

	}

}
