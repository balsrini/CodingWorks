package Assignment;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(solve("naman"));
	}
	 public static int solve(String A) {
		 return isPalindrome(A, 0, A.length() - 1);
	    }
	 
	 private static int isPalindrome(String A,int sIndex,int eIndex)
	 {
		 if(sIndex >= A.length() || eIndex < 0 || sIndex > eIndex)
			 return 1;
		 
		 if(A.charAt(sIndex) != A.charAt(eIndex))
			 return 0;
			  
		 return isPalindrome(A, sIndex + 1, eIndex - 1);
	 }
	 

}
