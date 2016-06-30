package br.com.hackerrank.java.introduction;

import java.io.InputStream;
import java.util.Scanner;

public class JavaEndOfFile {
	
	private InputStream systemIn;

	public JavaEndOfFile() {
		this(System.in);
	}

	public JavaEndOfFile(InputStream in) {
		this.systemIn = in;
	}
	
	public void execute() {
		Scanner sc = new Scanner(systemIn);
		int contador = 1;
		while (sc.hasNextLine()) {
			System.out.println(contador++ + " " + sc.nextLine());
		}
		sc.close();
	}

}
