package br.com.hackerrank.challenges.daysofcode.day26;

import java.io.InputStream;
import java.util.Calendar;
import java.util.Scanner;

public class NestedLogic {

	private InputStream systemIn;
	Scanner in = null;

	public NestedLogic() {
		this(System.in);
	}

	public NestedLogic(InputStream in) {
		systemIn = in;
	}

	public NestedLogic(Scanner in) {
		this.in = in;
	}

	public static void main(String[] args) {
		new NestedLogic().execute();
	}

	public void execute() {

		in = new Scanner(systemIn);
		NestedLogic l = new NestedLogic(in);

		int d1 = l.dateFormat(FD.DAY);
		int m1 = l.dateFormat(FD.MONTH);
		int y1 = l.dateFormat(FD.YEAR);

		int d2 = l.dateFormat(FD.DAY);
		int m2 = l.dateFormat(FD.MONTH);
		int y2 = l.dateFormat(FD.YEAR);
		
		Calendar date1 = l.returnCalendar(d1, m1, y1);
		Calendar date2 = l.returnCalendar(d2, m2, y2);
		
		int diffInDays = (int) ((date1.getTimeInMillis() - date2
				.getTimeInMillis()) / (1000 * 60 * 60 * 24));
		
		if(diffInDays < 0) {
			System.out.println("0");
			
		} else if ( m1 == m2 && y1 == y2)  {
			int resultado = 15 * (diffInDays);
			System.out.println(resultado);

		} else if ( m1 != m2 && y1 == y2)  {
			int resultado = 500 * (m1 - m2);
			System.out.println(resultado);
			
		} else {
			System.out.println("10000");
		}

		in.close();
	}
	
	private Calendar returnCalendar(int day, int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.YEAR, year);
		return cal;
	}

	public int dateFormat(FD enumm) {

		String type = null;
		int p1 = 0;
		int p2 = 0;
		if (enumm == FD.DAY) {
			type = "day";
			p1 = 1;
			p2 = 31;

		} else if (enumm == FD.MONTH) {
			type = "month";
			p1 = 1;
			p2 = 31;

		} else {
			type = "year";
			p1 = 1;
			p2 = 3000;
		}

		int p = in.nextInt();

		while (p < p1 || p > p2) {
			System.out.println("Please, put correct " + type);
			p = in.nextInt();
		}

		return p;
	}

	enum FD {
		DAY, MONTH, YEAR;
	}


}