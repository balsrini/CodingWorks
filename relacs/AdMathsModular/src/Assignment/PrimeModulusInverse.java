package Assignment;

public class PrimeModulusInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(3,4));
		System.out.println(solve(6,23));
	}
	public static int solve(int A, int B) {
		return powR(A,B-2,B);
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
