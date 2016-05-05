package br.com.hackerrank.artificialintelligence.botbuilding;

import java.io.InputStream;
import java.util.Scanner;

public class BotSavesPrincess {

	public static void main(String[] args) {
		new BotSavesPrincess().execute();
	}

	private InputStream systemIn;

	public BotSavesPrincess() {
		this(System.in);
	}

	public BotSavesPrincess(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);

		int m = in.nextInt();
		String grid[] = new String[m];
		for (int i = 0; i < m; i++) {
			grid[i] = in.next();
		}

		displayPathtoPrincess(m, grid);

		in.close();
	}

	private void displayPathtoPrincess(int n, String[] grid) {
		
		int xp = 0;
		int yp = 0;
		
		int xm = 0;
		int ym = 0;
		for (int i = 0; i < n; i++) {
			if(grid[i].contains("m")) {
				xm = i;
				ym = grid[i].indexOf("m");
				
			} else if (grid[i].contains("p")) {
				xp = i;
				yp = grid[i].indexOf("p");
			}
		}
		
//		System.out.println("p (x, y) = (" + xp + ", " + yp + ")");
//		System.out.println("m (x, y) = (" + xm + ", " + ym + ")");
		
		int qtdMH = xp - xm;
		int qtdMV = yp - ym;
		

		if(qtdMV < 0) {
			for (int i = 0; i < (qtdMV * -1); i++) {
				System.out.println("DOWN");
			}
		} else if (qtdMV > 0) {
			for (int i = 0; i < qtdMV; i++) {
				System.out.println("UP");
			}
		}

		if(qtdMH < 0) {
			for (int i = 0; i < (qtdMH * -1); i++) {
				System.out.println("RIGHT");
			}
		} else if (qtdMH > 0) {
			for (int i = 0; i < qtdMH; i++) {
				System.out.println("LEFT");
			}
		}
	}
}
