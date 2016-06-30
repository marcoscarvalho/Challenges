package br.com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	private static boolean flag = false;
	private static int B = 0;
	private static int H = 0;

	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();

		if (B > 0 && H > 0)
			flag = true;
		else
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		sc.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}

}
