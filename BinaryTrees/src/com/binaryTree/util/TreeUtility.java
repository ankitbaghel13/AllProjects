package com.binaryTree.util;

import com.binaryTree.traversal.Node;

public class TreeUtility {

	/*					   25
	 *					 /	  \
	 *				   /	    \			 
	 * 				15		       50
	 * 			  /	   \		 /    \  
	 *			10		22	   35	   70
	 * 		    /\	    /\     /\	   /\
	 * 		   4  12  18  24 31  44	 66  90
	 * 
	 * 
	 */
	public static Node getLargeTree(){

		Node tree = new Node(25);
		tree.left = new Node(15);
		tree.right = new Node(50);
		tree.left.left = new Node(10);
		tree.left.right = new Node(22);
		tree.right.left = new Node(35);
		tree.right.right = new Node(70);
		tree.left.left.left = new Node(4);
		tree.left.left.right = new Node(12);
		tree.left.right.left = new Node(18);
		tree.left.right.right = new Node(24);
		tree.right.left.left = new Node(31);
		tree.right.left.right = new Node(44);
		tree.right.right.left = new Node(66);
		tree.right.right.right = new Node(90);

		return tree;
	}


	/*					   1
	 *					 /	 \
	 * 				   2	  3
	 * 			     /	\		 
	 *			    4	 5	   
	 */
	public static Node getSmallTree(){

		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		tree.left.left = new Node(4);
		tree.left.right = new Node(5);
		tree.left.left.right = new Node(6);

		return tree;
	}
}
