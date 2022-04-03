package Assignment;

public class EnumeratingGCD {

	public static void main(String[] args) {
		System.out.println(solve("2877","96"));

	}
	   public static String solve(String A, String B) {
		   if(A.equals(B))
			   return A;
		   
		   int i = 0;
		   if(Math.max(A.length(), B.length()) > 6)
		   {
		   for(i=0;i<A.length() && i<B.length();i++)
		   {
			   if(A.charAt(i) != B.charAt(i))
				   break;
		   }
		   }
		   if( (A.length() - i) > 4 || (B.length() - i) > 4)
			   return "1";
		   int j = i;
		   
		   long a = 0;
		   while(j<A.length())
		   {
			   a =  a * 10 + A.charAt(j) - '0';
			   j++;
		   }
		   
		   long b = 0;
		   j = i;
		   while(j<B.length())
		   {
			   b =  b * 10 + B.charAt(j) - '0';
			   j++;
		   }	
		   
		   long temp = Math.min(a, b);
		   b = Math.max(a, b);
		   a = temp;
		   for(long k=a+1;k<=b;k++)
		   {
			   temp = getGCD(temp,k);
		   }
		   return Long.toString(temp);
	    }
	   public static long getGCD(long a,long b)
	   {
		   if(b == 0 )return a;
		   return getGCD(b, a%b);
	   }
	   

}
