package br.com.hackerrank.algorithms.warmup;

import java.io.InputStream;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		new Solution().execute();
	}

	private InputStream systemIn;

	public Solution() {
		this(System.in);
	}

	public Solution(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);
		in.close();
	}
}
