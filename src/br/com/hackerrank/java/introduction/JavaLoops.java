package br.com.hackerrank.java.introduction;

import java.io.InputStream;
import java.util.Scanner;

public class JavaLoops {

	private InputStream systemIn;

	public JavaLoops() {
		this(System.in);
	}

	public JavaLoops(InputStream in) {
		this.systemIn = in;
	}

	public static void main(String[] args) {
//		new JavaLoops().execute();
		System.out.println(Math.pow(2, 31));
		System.out.println(Math.pow(2, 31) - 1);
		System.out.println(Math.pow(-2, 31));
		System.out.println(Math.pow(2, 63));
		System.out.println(Math.pow(2, 63) - 1);
		System.out.println(Math.pow(-2, 63));
	}
	
	public void execute() {
		Scanner sc = new Scanner(systemIn);
		int tamanho = sc.nextInt();
		for (int i = 0; i < tamanho; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			for (int j = 1; j <= n; j++) {
				int soma = 0;
				
				for (int k = 0; k < j; k++) {
					soma += b * Math.pow(2, k);
				}
				
				soma += a;
				if(j == 1)
					System.out.print(soma);
				else
					System.out.print(" " + soma);
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
