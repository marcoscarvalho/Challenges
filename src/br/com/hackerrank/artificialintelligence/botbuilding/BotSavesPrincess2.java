package br.com.hackerrank.artificialintelligence.botbuilding;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class BotSavesPrincess2 {

	public static void main(String[] args) {
		new BotSavesPrincess2().execute();
	}

	private InputStream systemIn;

	public BotSavesPrincess2() {
		this(System.in);
	}

	public BotSavesPrincess2(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);

		int n, r, c;

		n = in.nextInt(); // length
		in.nextLine();
		r = in.nextInt(); // row
		c = in.nextInt(); // column
		in.nextLine();

		String grid[] = new String[n];

		for (int i = 0; i < n; i++) {
			grid[i] = in.next();
		}

		nextMove(n, r, c, grid);

		in.close();
	}

	private void nextMove(int n, int r, int c, String[] grid) {

		int xp = 0;
		int yp = 0;

		int xm = r;
		int ym = c;

		for (int i = 0; i < n; i++) {
			if (grid[i].contains("p")) {
				xp = i;
				yp = grid[i].indexOf("p");
				break;
			}
		}

		int qtdMV = xm - xp;
		int qtdMH = ym - yp;

		LinkedList<String> passos = new LinkedList<String>();

		if (qtdMV < 0) {
			for (int i = 0; i < (qtdMV * -1); i++) {
				passos.add("DOWN");
			}
		} else if (qtdMV > 0) {
			for (int i = 0; i < qtdMV; i++) {
				passos.add("UP");
			}
		}

		if (qtdMH < 0) {
			for (int i = 0; i < (qtdMH * -1); i++) {
				passos.add("RIGHT");
			}
		} else if (qtdMH > 0) {
			for (int i = 0; i < qtdMH; i++) {
				passos.add("LEFT");
			}
		}

		if (passos.size() > 0) {
			System.out.println(passos.get(0));
		}

	}
}
