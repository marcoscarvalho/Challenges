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
	private int qtdIteracoes = 1;

	public Solution() {
		this(System.in);
	}

	public Solution(InputStream in) {
		systemIn = in;
	}

	public Solution(InputStream in, int qtdIt) {
		systemIn = in;
		qtdIteracoes = qtdIt;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);

		int[] pos = new int[2];
		String board[] = new String[5];

		for (int i = 0; i < 2; i++)
			pos[i] = in.nextInt();

		for (int i = 0; i < 5; i++)
			board[i] = in.next();

		for (int i = 0; i < qtdIteracoes; i++) {
			if (i == 0)
				next_move(pos[0], pos[1], board);
			else
				next_move(getxBotClass(), getyBotClass(), board);
		}

		in.close();

	}

	private void next_move(int xBot, int yBot, String[] board) {
		List<DirtyCell> dirtyCells = getCenarios(xBot, yBot, board);

		if (dirtyCells.size() == 0) {
			return;
		}

		DirtyCell cenario = dirtyCells.get(0);

		// System.out.println(cenario);
		changePositionBot(xBot, yBot, board, true);

		if (cenario.getMovements().get(0).equals(CLEAN)) {
			changePositionBot(xBot, yBot, board, false);

		} else if (cenario.getMovements().get(0).equals(UP)) {
			xBot -= 1;
			changePositionBot(xBot, yBot, board, false);

		} else if (cenario.getMovements().get(0).equals(DOWN)) {
			xBot += 1;
			changePositionBot(xBot, yBot, board, false);

		} else if (cenario.getMovements().get(0).equals(RIGHT)) {
			yBot += 1;
			changePositionBot(xBot, yBot, board, false);

		} else if (cenario.getMovements().get(0).equals(LEFT)) {
			yBot -= 1;
			changePositionBot(xBot, yBot, board, false);
		}

		System.out.println(dirtyCells.get(0).getMovements().get(0));
		setxBotClass(xBot);
		setyBotClass(yBot);
		
		System.out.println(getxBotClass() + ", " + getyBotClass());
		for (int i = 0; i < 5; i++) {
			System.out.println(board[i]);
		}
		System.out.println();
	}

	public void execute2() {
		Scanner in = new Scanner(systemIn);

		int[] pos = new int[2];
		String board[] = new String[5];

		for (int i = 0; i < 2; i++)
			pos[i] = in.nextInt();

		for (int i = 0; i < 5; i++)
			board[i] = in.next();

		next_move(pos[0], pos[1], board);

		setBoardClass(board);

		in.close();

	}

	public void execute(int x, int y, String board[]) {
		next_move(x, y, board);
		setBoardClass(board);
	}

	private final String UP = "UP";
	private final String DOWN = "DOWN";
	private final String LEFT = "LEFT";
	private final String RIGHT = "RIGHT";
	private final String CLEAN = "CLEAN";

	private String[] boardClass;
	private int xBotClass;
	private int yBotClass;
	private String dirtyStr = "d";

	public void next_move2(int xBot, int yBot, String[] board) {
		// System.out.println(xBot + " " + yBot);
		// System.out.println(board);

		// 1ª Parte

		List<DirtyCell> dirtyCells = getCenarios(xBot, yBot, board);

		DirtyCell dirtyCell = dirtyCells.get(0);

		StringBuilder posi = new StringBuilder(board[xBot]);
		posi.setCharAt(yBot, '-');
		board[xBot] = posi.toString();

		if (dirtyCell.movements.size() == 0) {
			changePositionBot(xBot, yBot, board, false);
			System.out.println(CLEAN);

		} else if (dirtyCell.movements.get(0).equals(UP)) {
			xBot -= 1;
			changePositionBot(xBot, yBot, board, false);
			System.out.println(UP);

		} else if (dirtyCell.movements.get(0).equals(DOWN)) {
			xBot += 1;
			changePositionBot(xBot, yBot, board, false);
			System.out.println(DOWN);

		} else if (dirtyCell.movements.get(0).equals(LEFT)) {
			yBot -= 1;
			changePositionBot(xBot, yBot, board, false);
			System.out.println(LEFT);

		} else if (dirtyCell.movements.get(0).equals(RIGHT)) {
			yBot += 1;
			changePositionBot(xBot, yBot, board, false);
			System.out.println(RIGHT);

		} else if (dirtyCell.movements.get(0).equals(CLEAN)) {
			changePositionBot(xBot, yBot, board, false);
			System.out.println(CLEAN);
		}

		setxBotClass(xBot);
		setyBotClass(yBot);
	}

	private List<DirtyCell> getCenarios(int xBot, int yBot, String[] board) {
		List<DirtyCell> dirtyCells = new ArrayList<Solution.DirtyCell>();

		for (int i = 0; i < board.length; i++) {

			String row = board[i];
			char[] rowStr = row.toCharArray();

			for (int j = 0; j < row.length(); j++) {
				if (String.valueOf(rowStr[j]).equals(dirtyStr)) {

					int qtdX = i - xBot;
					int qtdY = j - yBot;

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

					} else if (qtdY < 0) {
						for (int h = 0; h < (qtdY * -1); h++) {
							movements.add(LEFT);
						}
					} else if (qtdY > 0) {
						for (int h = 0; h < qtdY; h++) {
							movements.add(RIGHT);
						}

					}

					movements.add(CLEAN);

					dirtyCells.add(new DirtyCell(i, j, qtdMovements, movements));
				}
			}
		}

		Collections.sort(dirtyCells);
		return dirtyCells;
	}

	private void changePositionBot(int xBot, int yBot, String[] board, boolean clean) {
		StringBuilder posi2 = new StringBuilder(board[xBot]);

		if (clean) {
			posi2.setCharAt(yBot, '-');

		} else if (board[xBot].charAt(yBot) == 'd') {
			posi2.setCharAt(yBot, 'd');

		} else {
			posi2.setCharAt(yBot, 'b');
		}

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

			// if (qtdM == 0 && movements.size() == o.getMovements().size()) {
			//
			// for (int i = 0; i < movements.size(); i++) {
			//
			// if (!movements.get(i).equals(o.getMovements().get(i))) {
			// if (movements.get(i).equals(CLEAN)) {
			// return qtdM - 1;
			// } else if (o.getMovements().get(i).equals(CLEAN)) {
			// return qtdM + 1;
			// } else if (movements.get(i).equals(LEFT) ||
			// movements.get(i).equals(UP)) {
			// return qtdM - 1;
			// }
			// }
			// }
			// }

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

	public String[] getBoardClass() {
		return boardClass;
	}

	public void setBoardClass(String[] boardClass) {
		this.boardClass = boardClass;
	}

	public int getxBotClass() {
		return xBotClass;
	}

	public void setxBotClass(int xBotClass) {
		this.xBotClass = xBotClass;
	}

	public int getyBotClass() {
		return yBotClass;
	}

	public void setyBotClass(int yBotClass) {
		this.yBotClass = yBotClass;
	}

	public int getQtdIteracoes() {
		return qtdIteracoes;
	}

	public void setQtdIteracoes(int qtdIteracoes) {
		this.qtdIteracoes = qtdIteracoes;
	}
}
