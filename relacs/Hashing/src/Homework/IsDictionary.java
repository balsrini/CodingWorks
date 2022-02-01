package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IsDictionary {

	public static void main(String[] args) {
//		String B= "adhbcfegskjlponmirqtxwuvzy";
//		ArrayList<String> A = new ArrayList<String>(Arrays.asList("hello", "scaler", "interviewbit"));
//		System.out.println(solve(A,B));
		
		String B= "wyaomjixrsqbzelgpnfktvhduc";
		ArrayList<String> A = new ArrayList<String>(Arrays.asList("roszv", "luopbz", "tsucqzzffskdo", "lzapbvospelnnqxargfxvuqjo", "xxruuqetpxo", "ztrqg", "svmmhzttldf", "rveuqnnameexbaebc", "bjnrzodfafpcsxa", "cwxgl"));
		System.out.println(solve(A,B));
	}
	
	 public static int solve(ArrayList<String> A, String B) {
		 HashMap<Character, Integer> order = new HashMap<Character, Integer>();
		 for(int i=0;i<B.length();i++)
		 {
			 order.put(B.charAt(i), i+1);
		 }
		 
		for(int i=0;i+1<A.size();i++)
		{
			if(!isSorted(A.get(i),A.get(i+1),order))
				return 0;
		}
			
		return 1;
		 
	    }
	 private static boolean isSorted(String f,String s,HashMap<Character, Integer> order)
	 {
		 int len = Math.min(f.length(), s.length());
		 int i=0;
		 for(i=0;i<len;i++)
		 {
			 if(order.get(f.charAt(i))  == order.get(s.charAt(i)))
				 continue;
			 
			 if(order.get(f.charAt(i))  < order.get(s.charAt(i)))
					 return true;	
			 else
				 return false;
		 }
		 if(f.length() <= i)
			  return true;
		 return false;
	 }

}
