package br.com.hackerrank.challenges.daysofcode.day10;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		String val = valueStr.substring(0, valueStr.length() - 1);
		int[] lottoNumbers = new int[val.length()];
		for (int i = 0; i < val.length(); i++) {
			lottoNumbers[i] = Integer.parseInt(String.valueOf(val.charAt(i)));
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
			// Going through each number here
			if (lottoNumbers[i] - lottoNumbers[i - 1] == 0)
				consecutives++; // Numbers were consecutive
		}

		// Return the number of consecutives
		return consecutives;
	}

}
