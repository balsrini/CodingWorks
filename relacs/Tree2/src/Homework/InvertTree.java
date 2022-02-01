package Homework;

import Assignment.TreeNode;

public class InvertTree {

	public static void main(String[] args) {
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);

		one.left = two;
		one.right = three;
		
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;
		
		one = invertTree(one);
		System.out.println(one);
	}
	  public static TreeNode invertTree(TreeNode A) {
		  if( A == null)
			  return null;		  
		  TreeNode left = A.left;
		  TreeNode right = A.right;				  
		  A.left = invertTree(right);
		  A.right = invertTree(left);
		  return A;
	    }

}
