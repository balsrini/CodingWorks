package Homework;

import Assignment.TreeNode;

public class IsSimilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int isSameTree(TreeNode A, TreeNode B) {
		  if(A == null && B == null)
			  return 1;
		  if(A == null && B != null)
			  return 0;
		  if( B == null && A != null)
			  return 0;
		  if(A.val == B.val)
			  return (isSameTree(A.left, B.left) == 1) && (isSameTree(A.right, B.right) == 1)?1:0;
		  
		  return 0;
	    }

}
