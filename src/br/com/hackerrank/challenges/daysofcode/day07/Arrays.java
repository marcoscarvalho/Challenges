package br.com.hackerrank.challenges.daysofcode.day07;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		new Arrays().execute();
	}

	private InputStream systemIn;

	public Arrays() {
		this(System.in);
	}

	public Arrays(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);

		int n = in.nextInt();
		Integer[] arr = new Integer[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		in.close();
		
		List<Integer> list = java.util.Arrays.asList(arr);
		Collections.reverse(list);
		
		for (int i = 0; i < arr.length; i++) {
			if (i == (arr.length - 1)) {
				System.out.print(list.get(i));
				
			} else {
				System.out.print(list.get(i) + " ");
			}
		}
	}
}
