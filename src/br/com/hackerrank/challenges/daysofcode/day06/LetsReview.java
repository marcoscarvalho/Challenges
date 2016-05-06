package br.com.hackerrank.challenges.daysofcode.day06;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LetsReview {

	public static void main(String[] args) {
		new LetsReview().execute();
	}

	private InputStream systemIn;

	public LetsReview() {
		this(System.in);
	}

	public LetsReview(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);
		int t = in.nextInt();
		in.nextLine();

		List<String> listString = new LinkedList<String>();
		for (int i = 0; i < t; i++) {
			listString.add(in.nextLine());
		}

		for (String string : listString) {
			String even = "";
			String odd = "";
			for (int i = 0; i < string.length(); i++) {
				if ((i % 2) == 0) {
					even += string.substring(i, i + 1);
				} else {
					odd += string.substring(i, i + 1);
				}
				
			}
			System.out.println(even + " " + odd);
		}

		in.close();
	}
}
