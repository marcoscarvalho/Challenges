package br.com.hackerrank.algorithms;

import java.util.Scanner;

public class SherlockAndWatson {

	public static void main2(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); // length of array
		int k = in.nextInt(); // times to perform
		int q = in.nextInt(); // times to print
		int[] idxs = new int[q]; // position
		int[] a = new int[n]; // array

		in.nextLine();
		String array = in.nextLine();

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(array.split(" ")[i]);
		}

		for (int i = 0; i < q; i++) {
			idxs[i] = Integer.parseInt(in.nextLine());
		}

		in.close();

		for (int i = 0; i < k; i++) {
			int lastValue = a[n - 1];
			for (int j = n; j >= 0; j--) {
				if ((j - 2) < 0) {
					a[0] = lastValue;
					break;
				}
				a[j - 1] = a[j - 2];
			}
		}

		for (int i = 0; i < q; i++) {
			System.out.println(a[idxs[i]]);
		}
	}

}
