package br.com.hackerrank.challenges.daysofcode.day12;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {

	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores = testScores;
	}

	public String calculate() {
		int sum = 0;
		for (int i : testScores) {
			sum += i;
		}
		
		int r = sum/testScores.length;
		
		if(r < 40) {
			return "T";
		} else if (r < 55) {
			return "D";
		} else if (r < 70) {
			return "P";
		} else if (r < 80) {
			return "A";
		} else if (r < 90) {
			return "E";
		} else {
			return "O";
		}
	}

}

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());

	}

}
