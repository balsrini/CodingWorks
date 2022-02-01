package Assignment;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrder {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t6 = new TreeNode(6);

		t1.left = t6;
		t1.right = t2;
		t2.left = t3;
		System.out.println(postorderTraversal(t1));
	}
	
	public static ArrayList<Integer> postorderTraversal(TreeNode A) {
		
		if(A == null)
			return null;
		ArrayList<Integer> retVal = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<Integer> stack2 = new Stack<Integer>();
		TreeNode temp = A;
		stack.push(temp);

		while(stack.size() > 0)
		{
			temp = stack.pop();
			stack2.push(temp.val);
			if(temp.left != null)
				stack.push(temp.left);

			if(temp.right != null)
				stack.push(temp.right);
		}
		while(!stack2.isEmpty())
			retVal.add(stack2.pop());
		
		return retVal;
    }

}
