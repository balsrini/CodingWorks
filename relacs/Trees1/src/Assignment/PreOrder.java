package Assignment;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t6 = new TreeNode(6);

		t1.left = t6;
		t1.right = t2;
		t2.left = t3;
		
		System.out.println(preorderTraversal(t1));
	}

	public static ArrayList<Integer> preorderTraversal(TreeNode A) {
		if(A == null)
			return null;
		ArrayList<Integer> retVal = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode temp = A;
		stack.push(temp);

		while(stack.size() > 0)
		{
			temp = stack.pop();
			retVal.add(temp.val);
			if(temp.right != null)
				stack.push(temp.right);
			if(temp.left != null)
				stack.push(temp.left);
		}
		return retVal;
	}

}
