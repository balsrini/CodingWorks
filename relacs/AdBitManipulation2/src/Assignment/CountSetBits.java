package Assignment;

public class CountSetBits {

	public static void main(String[] args) {
		System.out.println(solve(4));

	}

	 public static int solve(int A) {
		 if(A ==0)
			 return 0;
		 if(A == 1 )
			 return 1;
		 if(A == 2)
			 return 2;
		int i = 31;
		while(!isSet(A, i))
			i--;
		int numBits = i - 1;
		int mod = 1000000007;
		int lastVal = (int)Math.pow(2, i) - 1;
		int retVal = (int) ((Math.pow(2, numBits)%mod) * (i)%mod)%mod;
		int temp = (retVal%mod + solve(A-lastVal-1)%mod +(A-lastVal)%mod)%mod;
		return temp;
		
		
	    }
	 
	 private static boolean isSet(int N,int index)
	  {
		  return ((N & 1<<index) !=0); 				 
	  }
	 
	 
}
