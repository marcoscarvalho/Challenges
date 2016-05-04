package br.com.hackerrank.algorithms;

import java.io.InputStream;
import java.util.LinkedList;
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

	public void execute2() {
		Scanner scan = new Scanner(systemIn);
		int size = scan.nextInt();
		int rot = scan.nextInt();
		int t = scan.nextInt();
		// int[] a = new int[size];
		LinkedList<Integer> a = new LinkedList<Integer>();
		for (int i = 0; i < size; i++) {
			int element = scan.nextInt();
			a.add(element);

		}
		for (int i = 0; i < rot; i++) {
			a.addFirst(a.getLast());
			a.removeLast();
		}
		// System.out.println(a);
		while (t > 0) {
			t--;
			int postion = scan.nextInt();
			System.out.println(a.get(postion));
		}

		scan.close();
	}

}
