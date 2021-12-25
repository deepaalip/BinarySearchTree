package com.bridgelabz.BST;

public class MyBinaryTree<K extends Comparable<K>> {
	
	static MyBinaryNode root;
	
	 public void add(K key) {
		 this.root = this.addRecursively(root, key);
	 }

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> root, K key) {
		if(root == null) {
			root = new MyBinaryNode<>(key);
		return root;
	}
		int compareResult = key.compareTo(root.key);
		if(compareResult == 0) return root;
		if(compareResult < 0) {
			root.left = addRecursively(root.left, key);
		}
		else {
			root.right = addRecursively(root.right, key);
		}
		return root;
	}
	
	/** preOrder traversal :- root , left , right **/
	 void printPreorder(MyBinaryNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.key + "  ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	 
	void printInorder(MyBinaryNode node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
	  
	
	 void printPostorder(MyBinaryNode node)
	    {
	        if (node == null)
	            return;
	        printPostorder(node.left);
	        printPostorder(node.right);
	        System.out.print(node.key + " ");
	    }
	 
	    void printPostorder() { printPostorder(root); }
	    void printInorder() { printInorder(root); }
	    void printPreorder() { printPreorder(root); }
	 
	 
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> root) {
		
		return root == null ? 0 : 1 + this.getSizeRecursive(root.left)
		                               + this.getSizeRecursive(root.right);
	
	}

	
	
	
}	 
	 
   
	
	
	
	

