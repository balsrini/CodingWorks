package Assignment;

public class NcrModPrimeP {

	public static void main(String[] args) {
//		System.out.println(solve(5,2,13));
//		System.out.println(solve(6,2,13));
		System.out.println(solve(8458,506,540907));

	}
	
	 public static int solve(int A, int B, int C) {
		 int num = nFactModP(A,C);
		 int d1 = nFactModP((A-B),C);
		 int d2 = nFactModP(B,C);
		 int d3 = powR(d1,C-2,C);
		 int d4 = powR(d2,C-2,C);
		 
		 double retVal = (1d * num%C * d4%C)%C ;		 
		 retVal = (1d * retVal%C * d3%C)%C;
		 
		 return (int)(retVal + C)%C;
				 
	    }
 
	 private static int nFactModP(int n,int p)
	 {
		 int retVal = 1;
		 for(int i=1;i<=n;i++)
		 {
			 retVal = (retVal * i%p)%p;
		 }
		 return (retVal + p)%p;
				 
	 }

	public static int powR(int A,int B,int C)
	{
		if(A == 0)
			return 0;
		if(B == 0)
			return 1;
		long ret = 1L;
		if(B%2 == 1)
		{
			ret = A%C;			
			ret = (powR(A,B-1,C)%C * ret)%C;
		}else
		{
			ret = powR(A,B/2,C); 
			ret =  (ret * ret)%C;
		}
		return (int)(ret + C)%C;
	}
}
