package br.com.hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMedian {

	/**
	 * In the Quicksort challenges, you sorted an entire array. Sometimes, you
	 * just need specific information about a list of numbers, and doing a full
	 * sort would be unnecessary. Can you figure out a way to use your partition
	 * code to find the median in an array?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // tamanho do array e ímpar
		int[] ar = new int[n]; // 11 valores

		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}

		scan.close();
		Arrays.sort(ar);

		int median = ar[ar.length / 2];
		if (ar.length % 2 == 0) {
			median += ar[(ar.length / 2) + 1];
		}

		System.out.println(median);
	}

}
