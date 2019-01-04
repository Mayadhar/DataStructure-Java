package com.bst;

public class Main {
	public static void main(String[] args) {

		IBinarySearchTree tree = new IBinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(80);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);

		tree.printBST();
		
		tree.deleteBST(40);
		tree.printBST();
	}
}
