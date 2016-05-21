package br.com.hackerrank.challenges.daysofcode.day22;

import java.io.InputStream;
import java.util.Scanner;

public class BinarySearchTrees {

	private InputStream systemIn;

	public BinarySearchTrees() {
		this(System.in);
	}

	public BinarySearchTrees(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new BinarySearchTrees().execute();
	}

	public void execute() {

		Scanner sc = new Scanner(systemIn);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
		sc.close();
	}

	public static int getHeight(Node root) {
		return root.data;
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);

		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;

			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			
			return root;
		}
	}
}

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}