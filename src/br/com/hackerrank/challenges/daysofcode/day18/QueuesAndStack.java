package br.com.hackerrank.challenges.daysofcode.day18;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class QueuesAndStack {

	private InputStream systemIn;

	public QueuesAndStack() {
		this(System.in);
	}

	public QueuesAndStack(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new QueuesAndStack().execute();
	}

	public void execute() {

		Scanner scan = new Scanner(systemIn);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Palindrome p = new Palindrome();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is "
				+ ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
		scan.close();
	}

}

class Palindrome {
	
	private LinkedList<Character> stack = new LinkedList<Character>();
	private LinkedList<Character> queue = new LinkedList<Character>();
	
	
	public void pushCharacter(char c) {
		stack.add(c);
	}

	public void enqueueCharacter(char c) {
		queue.add(c);
	}
	
	public char popCharacter() {
		return stack.getLast();
	}

	public char dequeueCharacter() {
		return queue.getFirst();
	}
	

}