package Homework;

import java.util.ArrayList;
import java.util.Collections;

import Assignment.TreeNode;

public class PathToGivenNode {

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
		
		System.out.println(solve(one,5));

	}
	public static ArrayList<Integer> solve(TreeNode A, int B) {
		ArrayList<Integer> retVal = new ArrayList<Integer>();
		if(A == null)
			return retVal;
		if(A.val == B)
		{
			retVal.add(A.val);
			return retVal;
		}
		int size = retVal.size();
		retVal.add(A.val);
		ArrayList<Integer> left = solve(A.left, B);
		if(left.size() > 0)
		{
			retVal.addAll(left);
			return retVal;
		}
		ArrayList<Integer> right = solve(A.right, B);
		if(right.size() > 0)
		{
			retVal.addAll(right);
			return retVal;
		}
		retVal.remove(size);
		return retVal;
	}


}
