package br.com.hackerrank.util;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class DoubleAsker {

	private final Scanner scanner;
	private final PrintStream out;

	public DoubleAsker(InputStream in, PrintStream out) {
		scanner = new Scanner(in);
		this.out = out;
	}

	public double ask(double message) {
		out.println(message);
		double p = scanner.nextDouble();
		return p;
	}

}
