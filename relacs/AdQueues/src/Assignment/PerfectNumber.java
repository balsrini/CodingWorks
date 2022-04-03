package Assignment;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumber {
	public static void main(String []st)
	{
		System.out.println(solve(6));
	}

	   public static String solve(int A) {
		   Queue<String> ret = new LinkedList<String>();
		   ret.add("11");
		   if(A == 1)
			   return ret.poll();
		   ret.add("22");
		   	if(A==2)
		   		return ret.poll();
		   int i = 2;
		   String temp[] = {"1","2"};		   
		   while( i<A)
		   {
			  String lastinQ = ret.poll();			  
			  for(int j =0;j<temp.length;j++)
			  {
				  StringBuilder st = new StringBuilder(lastinQ);
				  int size = st.length();
				  int mid = size/2;						  
				  st.insert(mid, temp[j]);
				  st.insert(mid, temp[j]);
				  String newSt = st.toString();
				  ret.add(newSt);				  
				  i = i+1;
				  if(i == A)
					  return newSt;
			  }			   
		   }
		   
		   return null;
	    }
}
