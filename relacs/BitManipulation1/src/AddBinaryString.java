
public class AddBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(solve("10001100010111000101100010100110001001101010000010011010","101111000100100100111110010010101110101001100100101001111010011000000110"));
		System.out.println(solve("1010110111001101101000","1000011011000000111100110"));
		
	}
	
	public static String solve(String A,String B)
	{
		int aLen = A.length();
		int bLen = B.length();
		int diff = aLen - bLen;
		if(diff > 0)
			B = getPaddedString(B, diff);
		else if(diff < 0)
			A = getPaddedString(A, Math.abs(diff));
		
		int carry = 0;
		int i = A.length() - 1;
		StringBuffer retVal = new StringBuffer(A.length() + 1);
		while(i >= 0)
		{
			int aBit = getByte(A, i);
			int bBit = getByte(B, i);
			int sum = carry + aBit + bBit;
			retVal.append( sum%2 );
			carry = sum/2;
			i--;
		}
		
		while(carry != 0)
		{			
			retVal.append(carry%2);
			carry = carry/2;
		}
		
		retVal = retVal.reverse();
		
		return retVal.toString();		
	}
	
	
	

	private static int getByte(String st, int i)
	{
		return st.charAt(i) - 48;		
	}
	 
	private static String getPaddedString(String st, int pad)
	{
		StringBuffer sb = new StringBuffer(st.length() + pad);
		for(int i=0;i<pad;i++)
		{
			sb.append('0');
		}
		sb.append(st);
		return sb.toString();
		
	}
	

}
