package com.bst;

public class IBinarySearchTree {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			this.key = item;
			this.left = null;
			this.right = null;
		}
	}

	Node root;

	public IBinarySearchTree() {
		super();
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		} else if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}

		return root;
	}

	void deleteBST(int key) {
		root = deleteRec(root, key);
		System.out.println();
	}

	Node deleteRec(Node root, int key) {
		if (root == null) {
			return root;
		} else if (key < root.key) {
			root.left = deleteRec(root.left, key);
		} else if (key > root.key) {
			root.right = deleteRec(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			root.key = minValue(root.right);

			root.right = deleteRec(root.right, root.key);
		}
		return root;
	}

	int minValue(Node right) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

	void printBST() {
		display(root);
	}

	void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(root.key + ", ");
			display(root.right);
		}
	}

}
