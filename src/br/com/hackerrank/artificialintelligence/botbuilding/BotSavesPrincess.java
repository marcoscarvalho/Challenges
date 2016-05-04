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

	}
}
