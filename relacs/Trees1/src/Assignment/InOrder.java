package Assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;



public class InOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t6 = new TreeNode(6);

		t1.left = t6;
		t1.right = t2;
		t2.left = t3;
		
//		TreeNode A = new TreeNode(0);
//		TreeNode B = new TreeNode(1);
//		TreeNode C = new TreeNode(2);
//		A.left = B;
//		A.right = C;
		
		System.out.println(inorderTraversal(t1));
	}
	
	 public static ArrayList<Integer> inorderTraversal(TreeNode A) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		 ArrayList<Integer> retVal = new ArrayList<Integer>();
		 TreeNode curr = A;		 		 
		 while(curr != null || stack.size() > 0)
		 { 				
			while(curr != null)
			{
				stack.push(curr);
				curr = curr.left;
			}			
			curr = stack.pop();
			retVal.add(curr.val);
			curr = curr.right;			
		 }
		 return retVal;
	    }
	 
	 public ArrayList<Integer> inorderTraversal1(TreeNode A) {
         Stack<TreeNode> stack = new Stack<TreeNode>();
		 ArrayList<Integer> retVal = new ArrayList<Integer>();
		 TreeNode temp = A;
		 stack.push(temp);
		 while(stack.size() > 0)
		 { 				
			while(temp.left != null)
			{
				stack.add(temp.left);
				temp = temp.left;
			}			
			temp = stack.pop();
			retVal.add(temp.val);	
			if(temp.right != null)
			{				
				stack.push(temp.right);
				temp = temp.right;
			}
		 }
		 return retVal;
    }

}

