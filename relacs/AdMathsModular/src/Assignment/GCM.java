package Assignment;

public class GCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(5,0));
	}

	 public static int solve(int A, int B) {
		 int diff = Math.abs(A-B);
		 for(int i=diff;i>=0;i--)
		 {
			 if(diff%i == 0)
				 return i;
		 }
		 
		 return 1;
	    }
}
