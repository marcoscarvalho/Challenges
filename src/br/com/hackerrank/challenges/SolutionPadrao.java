package br.com.hackerrank.challenges;

import java.io.InputStream;
import java.util.Scanner;

public class SolutionPadrao {

	public static void main(String[] args) {
		new SolutionPadrao().execute();
	}

	private InputStream systemIn;

	public SolutionPadrao() {
		this(System.in);
	}

	public SolutionPadrao(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);
		in.close();
	}
}
