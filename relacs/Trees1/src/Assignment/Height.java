package Assignment;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		TreeNode t4 = new TreeNode(4);
		TreeNode t3 = new TreeNode(3);
		

		t1.left = t4;
		t1.right = t3;
		System.out.println(solve(t1));

	}
	
	public static int solve(TreeNode A) {
		if(A == null)
			return 0;
		return 1+ Math.max(solve(A.left),solve(A.right));
    }

}
