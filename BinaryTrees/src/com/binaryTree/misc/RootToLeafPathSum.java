package com.binaryTree.misc;

import com.binaryTree.traversal.Node;
import com.binaryTree.util.TreeUtility;

public class RootToLeafPathSum {

	Node root;

	public RootToLeafPathSum() {
		root = null;
	}

	public static void main(String[] args) {

		RootToLeafPathSum tree = new RootToLeafPathSum();
		tree.root = TreeUtility.getSmallTree();
		System.out.println(tree.rootToLeafPathSum(8));
	}

	public boolean rootToLeafPathSum(int sum) {

		return rootToLeafPathSum(root, sum);
	}

	public boolean rootToLeafPathSum(Node root, int sum) {

		if (root == null)
			return sum == 0;
		else {

			boolean ans = false;
			int subSum = sum - root.key;
			
			if(subSum==0&&root.left==null&&root.right==null)
				return true;
			if(root.left!=null)
				ans = ans || rootToLeafPathSum(root.left,subSum);
			if(root.right!=null)
				ans = ans || rootToLeafPathSum(root.right,subSum);
			
			return ans;
		}

	}

}
