package br.com.hackerrank.challenges.daysofcode.day11;

import java.io.InputStream;
import java.util.Scanner;
import java.util.TreeSet;

public class Arrays2D {

	public static void main(String[] args) {
		new Arrays2D().execute();
	}

	private InputStream systemIn;

	public Arrays2D() {
		this(System.in);
	}

	public Arrays2D(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);

		int arr[][] = new int[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		verifyHourglassWithTheMaximumSum(arr);

		in.close();
	}

	private static void verifyHourglassWithTheMaximumSum(int arr[][]) {

		TreeSet<Integer> hourglass = new TreeSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (i <= arr.length - 3 && j < arr[i].length - 2) {
					int count = 0;
					count = arr[i][j] 	+ 	arr[i][j + 1] + arr[i][j + 2] +
											arr[i+1][j+1] +
							arr[i+2][j] + 	arr[i+2][j+1] + arr[i+2][j+2];
					hourglass.add(count);
				} else {
					break;
				}
			}
		}

		System.out.println(hourglass.last());

	}
}
