package br.com.hackerrank.util;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IntegerAsker {

	private final Scanner scanner;
	private final PrintStream out;

	public IntegerAsker(InputStream in, PrintStream out) {
		scanner = new Scanner(in);
		this.out = out;
	}

	public int ask(int message) {
		out.println(message);
		int p = scanner.nextInt();
		return p;
	}

}
