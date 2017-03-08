package br.com.hackerrank.crackingthecodinginterview;

import java.io.InputStream;
import java.util.Scanner;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		new ArraysLeftRotation().execute();
	}

	private InputStream systemIn;

	public ArraysLeftRotation() {
		this(System.in);
	}

	public ArraysLeftRotation(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);

		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

		in.close();
	}

	public int[] arrayLeftRotation(int[] a, int n, int k) {

		int i, j;
		for (i = 0; i < k; i++) {
			int temp = a[0];
			for (j = 0; j < n - 1; j++) {
				a[j] = a[j + 1];
			}
			a[j] = temp;
		}

		return a;
	}
}
