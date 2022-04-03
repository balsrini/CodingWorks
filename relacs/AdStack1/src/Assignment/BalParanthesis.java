package Assignment;

import java.util.Stack;

public class BalParanthesis {

	public static void main(String[] args) {
		System.out.println(solve("{([])}"));

	}
	
	  public static int solve(String A) {
		  Stack<Character> st  = new Stack<Character>();
		  char ch[] = A.toCharArray();
		  for(char c:ch)
		  {
			  if(c == '{' || c == '(' || c== '[')
			  {
				  st.push(c);
			  }else
			  {
				  if(st.size() == 0)
					  return 0;
				  char ret = st.pop();
				  if( (ret == '{' && c == '}') || (ret == '(' && c == ')') || (ret == '[' && c == ']'))
				  {
					  continue;
				  }else
				  {
					  return 0;
				  }
			  }
		  }
		  if(st.size() == 0)
			  return 1;
		  return 0;

	    }

}
