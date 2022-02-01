package Homework;

import Assignment.TreeNode;

public class NodeCount {

	public static void main(String[] args) {
		

	}
	  public int solve(TreeNode A) {
		  if(A == null)
			  return 0;
		  return 1 + solve(A.left) + solve(A.right);
	    }

}
