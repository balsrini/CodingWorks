package Assignment;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(solve(4));

	}
	 public static int solve(int A) {
		 if(A == 1)
			 return 1;
		 return A * solve(A -1);
	    }
}
