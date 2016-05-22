package br.com.hackerrank.challenges.daysofcode.day23;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class BSTLevelOrderTraversal {

	private InputStream systemIn;

	public BSTLevelOrderTraversal() {
		this(System.in);
	}

	public BSTLevelOrderTraversal(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new BSTLevelOrderTraversal().execute();
	}

	public void execute() {

		Scanner sc = new Scanner(systemIn);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
		sc.close();
	}

	public static int getHeight(Node node) {
		if (node == null) {
			return -1;
		}

		int lefth = getHeight(node.left);
		int righth = getHeight(node.right);

		if (lefth > righth) {
			return lefth + 1;
		} else {
			return righth + 1;
		}
	}

	public static void levelOrder(Node root) {
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.data + " ");
			
			if (temp.left != null)
				queue.add(temp.left);

			if (temp.right != null)
				queue.add(temp.right);
		}
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