package Assignment;

public class AddString {

	public static void main(String[] args) {
			
		System.out.println(addBinary("111", "11"));
	}
	  public static String addBinary(String A, String B) {
		int len = Math.min(A.length(), B.length());
		int carry = 0;
		StringBuilder retVal = new StringBuilder();
		for(int i=0;i<len;i++)
		{
			char aCh = A.charAt(A.length() - i-1);
			char bCh = B.charAt(B.length() - i-1);
			int a = 1, b =1;
			if(aCh == '0')
				a = 0;
			if(bCh == '0')
				b = 0;
			int c = (carry + a + b );
			carry = c/2;
			c = c%2;
			retVal.append(c);
		}
		
		if(A.length() > len)
		{
			carry = appendRemaining(A, carry, len, retVal);
		}else if(B.length() > len)
		{
			carry = appendRemaining(B, carry, len, retVal);
		}		
		
		
		if(carry  == 1 )
			retVal.append(carry);
		
		  return retVal.reverse().toString();
		  
	    }
	  
	  private static int appendRemaining(String A,int carry, int len, StringBuilder sb)
	  {
			for(int i = A.length()-len -1;i>=0;i--)
			{
				int a = A.charAt(i) == '0'?0:1;
				int c = carry + a;
				carry = c/2;
				c= c%2;
				sb.append(c);
			}
			return carry;
	  }

}
