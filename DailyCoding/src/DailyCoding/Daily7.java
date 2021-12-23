package DailyCoding;

/**
 * Given the mapping a = 1, b = 2, ... z = 26,
 *  and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 * @author Balaji
 *
 */
public class Daily7 {

	public static void main(String []args)
	{
		System.out.println(countNumWays("999"));
	}
	
	private static int countNumWays(String st)
	{
		if(st == null || st.isBlank() || st.isEmpty())
			return 1;
				
		String newSt = st.substring(1);				
		int count = countNumWays(newSt) ;		
		if(st.length() >= 2)
		{
			String doubleStr = st.substring(0, 2);
			if(Integer.parseInt(doubleStr) < 26)
				count = count + countNumWays(st.substring(2));			 
		}		
		return count;
	}
	
}
