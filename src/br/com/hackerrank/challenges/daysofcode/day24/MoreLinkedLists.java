package br.com.hackerrank.challenges.daysofcode.day24;

import java.io.InputStream;
import java.util.Scanner;

public class MoreLinkedLists {

	private InputStream systemIn;

	public MoreLinkedLists() {
		this(System.in);
	}

	public MoreLinkedLists(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new MoreLinkedLists().execute();
	}

	public void execute() {

		Scanner sc = new Scanner(systemIn);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
		sc.close();
	}

	public static Node removeDuplicates(Node head) {

		Node temp = head;

		while (temp != null) {
			
			int data = temp.data;
			Node tempNext = temp.next;
			
			if (tempNext != null && data == tempNext.data) {
				
				Node tempNext2 = temp.next.next;
				boolean isBreak = false;
				
				while(data == tempNext2.data) {
					if(tempNext2.next != null && tempNext2.data == data) {
						tempNext2 = tempNext2.next;
					} else if (tempNext2.next == null) {
						isBreak = true;
						break;
					}
				}
				
				temp.next = tempNext2;
				
				if(isBreak) {
					temp.next = null;
					break;
				}
			}
			
			temp = temp.next;
		}

		return head;

	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
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