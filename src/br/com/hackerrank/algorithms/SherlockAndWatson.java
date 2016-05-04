package br.com.hackerrank.algorithms;

import java.io.InputStream;
import java.util.Scanner;

public class SherlockAndWatson {

	public static void main(String[] args) {
		new SherlockAndWatson().execute();
	}

	private InputStream systemIn;

	public SherlockAndWatson() {
		this(System.in);
	}

	public SherlockAndWatson(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);

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
