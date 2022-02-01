import java.util.Stack;

public class BalancedParanthe {

	public static void main(String []args)
	{
		System.out.println(solve("{([])}"));
		
		System.out.println(solve("(){"));
		System.out.println(solve("()[]"));
	}
	  public static int solve(String A) {
		  Stack<Character> st = new Stack<Character>();
		  for(Character ch:A.toCharArray())
		  {
			  if(ch.equals(']') || ch.equals(')') || ch.equals('}') )
			  {
				  if(st.isEmpty())
					  return 0;
				  Character c = st.pop();
				  if( ( c == '(' && ch!= ')' ) 
						  || ( c=='[' && ch != ']' )
						  || ( ch =='{' && ch != '}'))
						  {
					  		return 0;
						  }
			  }else
			  {
				  st.add(ch);
			  }
		  }
		  if(!st.isEmpty())
			  return 0;
		  
		  return 1;
		  
		  
	    }
	  
}
