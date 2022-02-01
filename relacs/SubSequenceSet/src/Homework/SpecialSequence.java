package Homework;

public class SpecialSequence {

	public static void main(String[] args) {
		System.out.println(solve("ABCGAG"));
		System.out.println(solve("GAB"));

	}
	 public static int solve(String A) {
		 int retVal = 0;
		 int numA = 0;
		 for(int i=0;i<A.length();i++)
		 {
			 char ch = A.charAt(i);
			 
			 if(ch == 'A')
			 {
				 numA++;
			 }else if(ch =='G')
			 {
				 retVal += numA;
			 }			 
		 }
		 return retVal;
		 
	    }

}
