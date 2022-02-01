package Assignment;

public class MirrorTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		TreeNode t2L = new TreeNode(2);
		TreeNode t2R = new TreeNode(2);		
		TreeNode t3L = new TreeNode(3);
		TreeNode t3R = new TreeNode(3);
		TreeNode t4L = new TreeNode(4);
		TreeNode t4R = new TreeNode(4);
		t1.left = t2L;
		t1.right = t2R;
		t2L.left = t3L;
		t2L.right = t4R;
		t2R.left = t4L;
		t2R.right = t3R;
	
		System.out.println(isSymmetric(t1));
	}
	
	 public static int isSymmetric(TreeNode A) {
		 if(A == null)
			 return 1;
		 
		 if(A.left == null && A.right == null)
			 return 1;
		 if(isMirror(A.left, A.right))
			 return 1;
		 return 0;
	    }
	 
	public static boolean isMirror(TreeNode left, TreeNode right)
	{
		if(left == null && right == null)
			return true;
		if( (left != null && right == null ) || (right != null && left == null) )
			return false;
		if(left.val == right.val)
		{
			return isMirror(left.left, right.right) & isMirror(left.right, right.left);
		}
		return false;
		
	}
}
