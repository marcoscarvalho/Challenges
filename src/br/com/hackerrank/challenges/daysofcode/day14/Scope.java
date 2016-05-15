package br.com.hackerrank.challenges.daysofcode.day14;

import java.io.InputStream;
import java.util.Scanner;
import java.util.TreeSet;

public class Scope {

	private InputStream systemIn;

	public Scope() {
		this(System.in);
	}

	public Scope(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new Scope().execute();
	}

	public void execute() {

		Scanner sc = new Scanner(systemIn);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Difference D = new Difference(a);

		D.computeDifference();

		System.out.println(D.maximumDifference);
		
		sc.close();
	}

	class Difference {
		private int[] elements;
		private int maximumDifference;

		public Difference(int[] elements) {
			this.elements = elements;
		}

		public void computeDifference() {
			TreeSet<Integer> set = new TreeSet<Integer>();

			for (int i = 0; i < elements.length; i++) {
				set.add(elements[i]);
			}

			maximumDifference = set.last() - set.first();
		}
	}

}
