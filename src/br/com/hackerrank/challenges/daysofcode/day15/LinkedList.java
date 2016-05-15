package br.com.hackerrank.challenges.daysofcode.day15;

import java.io.InputStream;
import java.util.Scanner;

public class LinkedList {

	private InputStream systemIn;

	public LinkedList() {
		this(System.in);
	}

	public LinkedList(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new LinkedList().execute();
	}

	public void execute() {

		Scanner sc = new Scanner(systemIn);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Node insert(Node head, int data) {
		if (head == null) {
			return new Node(data);
			
		} else if (head.next == null) {
			head.next = new Node(data);
			return head;
			
		} else {
			insert(head.next, data);
			return head;
		}
	}

}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}