package second;

public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = solve(4294967295l);	
		
		System.out.println(l);
		
	}
	
	private static long solve(long A)
	{
		StringBuffer sb = new StringBuffer(32);
		for(int i=0;i<32;i++)
			sb.append('0');
			
			
		for(int i=0;i<32;i++)
		{
			boolean isSet = isBitSet(A, i);
			sb.setCharAt(31-i, isSet?'1':'0');			
		}
		
		
		long retVal = 0;
		for(int i=0;i<32;i++)
		{			
			retVal = retVal + ((sb.charAt(i) == '1')?(1l<<i):0l);
		}
		
		return retVal;
	}
	private static long setBit(long A,int pos,boolean set)
	{
		if(set)
			return (A | (1<<pos));
		else
			return ( A ^ (1<<pos));
	}
	private static boolean isBitSet(long A, int pos)
	{
		return ((A & (1<<pos)) != 0);		
	}

}
