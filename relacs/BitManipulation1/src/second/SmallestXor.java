package second;

public class SmallestXor {

	public static void main(String[] args) {
		System.out.println(solve(4,6));

	}
	public static int solve(int A,int B)
	{
		int j =0;
		int retVal = 0;
		for(int i=30;i>=0 && j <B;i--)
		{
			if(isBitSet(A, i))
			{
				retVal = retVal | (1<<i);
				j++;
			}
		}
		if(j<B)
		{			
			for(int i=0;i<30 && j<B;i++)
			{
				if(!isBitSet(retVal, i))
				{
					retVal = setBit(retVal, i);
					j++;
				}
			}			
		}
		return retVal;
	}
	private static boolean isBitSet(int A,int pos)
	{
		return  (A & (1<<pos)) != 0;
	}
	private static int setBit(int A,int pos)
	{
		return (A | (1<<pos));
	}

}
