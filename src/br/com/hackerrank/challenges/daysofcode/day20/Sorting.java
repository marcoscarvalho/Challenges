package br.com.hackerrank.challenges.daysofcode.day20;

import java.io.InputStream;
import java.util.Scanner;

public class Sorting {

	private InputStream systemIn;

	public Sorting() {
		this(System.in);
	}

	public Sorting(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new Sorting().execute();
	}

	int numberOfSwaps = 0;

	public void execute() {
		

		Scanner in = new Scanner(systemIn);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		
		bubbleSort(a, n);
		
		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n-1]);
		
		in.close();
	}

	private void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {

					int v1 = a[j + 1];
					int v = a[j];

					a[j] = v1;
					a[j+1] = v;

					numberOfSwaps++;
				}
			}

			if (numberOfSwaps == 0) {
				break;
			}
		}
	}
	
}