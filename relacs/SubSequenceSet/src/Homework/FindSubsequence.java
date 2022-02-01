package Homework;

public class FindSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve("bit","dfbkjijgbbiihbmmt"));
		System.out.println(solve("apple","appel"));
	}
	
	  public static String solve(String A, String B) {
		  if(A.length() > B.length())
			  return "NO";
		  int match = 0;
		  for(int i=0;i<B.length();i++)
		  {
			  char ch = B.charAt(i);
			  if(match< A.length() && ch == A.charAt(match))
			  {
				  match++;
			  }
		  }
		  if(match == A.length())
		  {
			  return "YES";
		  }
		  return "NO";
	    }

}
