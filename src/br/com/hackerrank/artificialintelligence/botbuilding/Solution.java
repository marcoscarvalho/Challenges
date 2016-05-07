package br.com.hackerrank.artificialintelligence.botbuilding;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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

		int[] pos = new int[2];
		String board[] = new String[5];

		for (int i = 0; i < 2; i++)
			pos[i] = in.nextInt();

		for (int i = 0; i < 5; i++)
			board[i] = in.next();

		for (int i = 0; i < 1; i++) {
			next_move(pos[0], pos[1], board);
		}

		in.close();

	}

	private final String UP = "UP";
	private final String DOWN = "DOWN";
	private final String LEFT = "LEFT";
	private final String RIGHT = "RIGHT";
	private final String CLEAN = "CLEAN";

	private void next_move(int xBot, int yBot, String[] board) {
		// System.out.println(xBot + " " + yBot);
		// System.out.println(board);

		String dirtyStr = "d";

		// 1ª Parte

		List<DirtyCell> dirtyCells = new ArrayList<Solution.DirtyCell>();

		for (int i = 0; i < board.length; i++) {

			String row = board[i];
			char[] rowStr = row.toCharArray();

			for (int j = 0; j < row.length(); j++) {
				if (String.valueOf(rowStr[j]).equals(dirtyStr)) {

					int qtdX = i - xBot;
					int qtdY = j - yBot;

//					if (qtdX < 0)
//						qtdX = (qtdX * -1);
//
//					if (qtdY < 0)
//						qtdY = (qtdY * -1);

					int qtdMovements = qtdX + qtdY;

					LinkedList<String> movements = new LinkedList<String>();

					if (qtdX < 0) {
						for (int h = 0; h < (qtdX * -1); h++) {
							movements.add(UP);
						}
					} else if (qtdX > 0) {
						for (int h = 0; h < qtdX; h++) {
							movements.add(DOWN);
						}
					}

					if (qtdY < 0) {
						for (int h = 0; h < (qtdY * -1); h++) {
							movements.add(LEFT);
						}
					} else if (qtdY > 0) {
						for (int h = 0; h < qtdY; h++) {
							movements.add(RIGHT);
						}
					}

					if (qtdMovements != 0) {
						qtdMovements += 1;
						movements.add(CLEAN);
					}

					dirtyCells.add(new DirtyCell(i, j, qtdMovements, movements));
				}
			}
		}

		Collections.sort(dirtyCells);

		DirtyCell dirtyCell = dirtyCells.get(0);

		StringBuilder posi = new StringBuilder(board[xBot]);
		posi.setCharAt(yBot, '-');
		board[xBot] = posi.toString();

		if (dirtyCell.movements.size() == 0) {
			changePositionBot(xBot, yBot, board);
			System.out.println(CLEAN);

		} else if (dirtyCell.movements.get(0).equals(UP)) {
			xBot -= 1;
			changePositionBot(xBot, yBot, board);
			System.out.println(UP);

		} else if (dirtyCell.movements.get(0).equals(DOWN)) {
			xBot += 1;
			changePositionBot(xBot, yBot, board);
			System.out.println(DOWN);

		} else if (dirtyCell.movements.get(0).equals(LEFT)) {
			yBot -= 1;
			changePositionBot(xBot, yBot, board);
			System.out.println(LEFT);

		} else if (dirtyCell.movements.get(0).equals(RIGHT)) {
			yBot += 1;
			changePositionBot(xBot, yBot, board);
			System.out.println(RIGHT);

		} else if (dirtyCell.movements.get(0).equals(CLEAN)) {
			changePositionBot(xBot, yBot, board);
			System.out.println(CLEAN);
		}
	}

	private void changePositionBot(int xBot, int yBot, String[] board) {
		StringBuilder posi2 = new StringBuilder(board[xBot]);
		posi2.setCharAt(yBot, 'b');
		board[xBot] = posi2.toString();
	}

	class DirtyCell implements Comparable<DirtyCell> {
		private int x;
		private int y;
		private int qtdMovement;
		private LinkedList<String> movements;

		public DirtyCell(int positionX, int positionY, int qtdMovement, LinkedList<String> movements) {
			this.x = positionX;
			this.y = positionY;
			this.qtdMovement = qtdMovement;
			this.movements = movements;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getQtdMovement() {
			return qtdMovement;
		}

		public void setQtdMovement(int qtdMovement) {
			this.qtdMovement = qtdMovement;
		}

		public LinkedList<String> getMovements() {
			return movements;
		}

		public void setMovements(LinkedList<String> movements) {
			this.movements = movements;
		}

		@Override
		public int compareTo(DirtyCell o) {
			int qtdM = qtdMovement - o.getQtdMovement();
			return qtdM;
		}

		@Override
		public String toString() {
			StringBuilder str = new StringBuilder();

			String virgula = ", ";

			str.append("{ (");
			str.append(x);
			str.append(virgula);
			str.append(y);
			str.append(")" + virgula);
			str.append(qtdMovement);
			str.append(virgula);
			str.append(movements);
			str.append("}");

			return str.toString();
		}

	}
}
