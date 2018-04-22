package com.binaryTree.traversal;

import java.util.LinkedList;
import java.util.Queue;

import com.binaryTree.util.TreeUtility;

public class LevelOrderTraversal {

	Node root;

	public LevelOrderTraversal() {
		root = null;
	}

	public static void main(String[] args) {

		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = TreeUtility.getLargeTree();

		System.out.println("Level Order traversal of binary tree is ");
		tree.levelOrderTraversalWithQueue();
		
		tree.printGivenLevel(2);
	}

	public void printGivenLevel(int i) {
		
		
	}

	public void levelOrderTraversalWithQueue() {
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			Node tempNode = queue.poll();
			System.out.print(tempNode.key+" ");
			if(tempNode.left!=null)	
				queue.add(tempNode.left);
			if(tempNode.right!=null)
				queue.add(tempNode.right);
		}
	}

}
