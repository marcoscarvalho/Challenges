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
		StringBuilder value = new StringBuilder();

		while (n != 1) {
			value.append(n % 2);
			n = n / 2;
		}

		if (n == 1) {
			value.append("1");
		}

		String valueStr = value.reverse().toString();
		String valueStrr = valueStr.split("0")[0];
		int[] lottoNumbers = new int[valueStrr.length()];
		for (int i = 0; i < valueStrr.length(); i++) {
			lottoNumbers[i] = Integer.parseInt(String.valueOf(valueStrr.charAt(i)));
		}

		int consecutiveNumbers = getConsecutiveNumbers(lottoNumbers);

		if (consecutiveNumbers == 0 && n == 1) {
			System.out.println(1);

		} else {
			System.out.println(consecutiveNumbers);

		}

		in.close();
	}

	public int getConsecutiveNumbers(int[] lottoNumbers) {
		int consecutives = 0;
		// i starts at 1 not 0
		for (int i = 1; i < lottoNumbers.length; i++) {
			if (1 == i && lottoNumbers[0] == 1) {
				consecutives++; // Numbers were consecutive
			}

			// Going through each number here
			if (lottoNumbers[i] == 1 && lottoNumbers[i] - lottoNumbers[i - 1] == 0)
				consecutives++; // Numbers were consecutive
		}

		// Return the number of consecutives
		return consecutives;
	}

	private int getMaxOfBinary(int i) {
		int max = 0;
		ArrayList<Integer> tempMax = new ArrayList<Integer>();
		int currentmax = 0;
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
