package Assignment;

import java.util.ArrayList;

public class BSTNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int solve(TreeNode A, int B, int C) {
		  ArrayList<Integer> retVal = new ArrayList<Integer>();
		  inOrder(A, B, C, retVal);
		  return retVal.size();
	    }
	  
	  private void inOrder(TreeNode A, int B, int C,ArrayList<Integer> retVal)
	  {
		  if(A == null)
			  return;
		  inOrder(A.left,B,C,retVal);
		  if(A.val >= B && A.val <= C)
			  retVal.add(A.val);
		  inOrder(A.right, B, C, retVal);
	  }

}
