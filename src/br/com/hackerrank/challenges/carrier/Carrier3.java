package br.com.hackerrank.challenges.carrier;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Carrier3 {

	public static void main(String[] args) throws IOException {
		new Carrier3().execute();
	}

	private InputStream systemIn;

	public Carrier3() {
		this(System.in);
	}

	public Carrier3(InputStream in) {
		systemIn = in;
	}

	public void execute() throws IOException {
		Scanner scanner = new Scanner(systemIn);
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int valuesCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] values = new String[valuesCount];

		for (int i = 0; i < valuesCount; i++) {
			String valuesItem = scanner.nextLine();
			values[i] = valuesItem;
		}

		String[] res = braces(values);

		for (int i = 0; i < res.length; i++) {
			bufferedWriter.write(res[i]);

			if (i != res.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

	// Complete the braces function below.
	private static String[] braces(String[] values) {
		List<String> list = new ArrayList<String>();
		for (String string : values) {
			list.add(verifyBraces(string));
		}
		return list.toArray(new String[list.size()]);
	}

	private static String verifyBraces(String value) {

		Stack<String> s = new Stack<String>();
		boolean isOk = false;

		for (int i = 0; i < value.length(); i++) {
			String str = "" + value.charAt(i);

			// if opening bracket then push into stack
			if (str.equals("(") || str.equals("[") || str.equals("{")) {
				s.push(str);
			}

			// if closing bracket, pop bracket and compare if its a pair
			if (str.equals(")") || str.equals("]") || str.equals("}")) {
				// if stack becomes empty in between then also its not balanced
				if (s.isEmpty()) {
					return "NO";
				}
				String opening = s.peek();
				if (str.equals(")") && opening.equals("(")) {
					s.pop();
				}
				if (str.equals("]") && opening.equals("[")) {
					s.pop();
				}
				if (str.equals("}") && opening.equals("{")) {
					s.pop();
				}
			}
		}
		// if stack is empty at end, then its balanced
		if (value.length() > 0 && s.isEmpty()) {
			isOk = true;
		}

		if (isOk)
			return "YES";
		else
			return "NO";

	}

}