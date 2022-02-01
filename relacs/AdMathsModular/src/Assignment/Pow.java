package Assignment;

public class Pow {

	public static void main(String[] args) {
		System.out.println(powR(79161127,99046373,57263970));

	}

	public static int pow(int A,int B,int C)
	{
		  if(A ==0)
	            return 0;
	       	long ret = 1L;		
			long a = A;
			int n = B;
			int m = C;
			while(n >0)
			{
				if(n%2 == 1)
					ret = (ret * a)%m;
				n = n/2;
				a = (a * a)%m;		
				
			}
	        ret = (ret + m);
	        ret = ret%m;
			return (int)ret;
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
		return (int)ret;
	}
}
