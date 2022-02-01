package Homework;

import java.util.ArrayList;

import Assignment.TreeNode;

public class CountingNodes {

	public static void main(String[] args) {
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode six = new TreeNode(6);
		
		four.left = five;
		four.right = two;
		two.left = three;
		two.right = six;
		System.out.println(solve(four));

	}
	 public static int solve(TreeNode A) {
		 return rSolve(A, new ArrayList<Integer>());
		 
		 
	    }
	 
	 public static int rSolve(TreeNode A,ArrayList<Integer> arr) {
		 if(A == null)
			 return 0;
		 
		 int val = A.val;
		 int count = 1;
		 for(int i:arr)
		 {
			 if(i > val)
			 {
				 count = 0;
				 break;				 
			 }
		 }
		 int size= arr.size();
		 arr.add(A.val);		 
		 count = count + rSolve(A.left,arr) + rSolve(A.right,arr);		 
		 arr.remove(size);
		 return count;	 
		 
	    }
	 

}
