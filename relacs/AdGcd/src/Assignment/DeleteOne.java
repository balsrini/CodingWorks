package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteOne {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(208610688, 48106344, 135402124, 34168992, 95013776, 35218040, 117231114, 172905590, 66652014, 45970782, 222323244, 203402914, 35292972, 159829956, 154584716, 107190226, 71335264, 42786172, 203327982, 3484338, 28062034, 64179258, 210993, 94938844, 155858560, 123562868, 223447224, 116744056, 55711942, 88082566, 45671054, 16072914, 165299992, 136601036, 44659472, 219063702, 202953322, 188341582, 116931386, 127759060, 131318330, 49867246, 92278758, 40875406, 218314382, 135889182, 6893744, 97111872, 56236466, 96662280, 52340002, 195010530, 44884268, 167435554, 155746162, 201679478, 54138370, 103481092, 25814074, 186093622, 208498290, 31883566, 122101694, 128058788, 133566290, 55749408, 178675354, 186056156, 155071774, 35180574, 82050540, 7755462, 29448276, 100333948, 130156884, 67850926, 44509608, 17084496, 216703344, 197295956, 174479162, 18058612, 51290954, 173917172, 51815478, 218426780, 184032992, 148140564, 108951128 ));
		System.out.println(solve(A));

	}

	  public static int solve(ArrayList<Integer> A) {
		  int maxGCD = Integer.MIN_VALUE;
		  ArrayList<Integer> gPrefix = new ArrayList<Integer>();
		  ArrayList<Integer> gSuffix = new ArrayList<Integer>();
		  for(int i:A)
		  {
			  gSuffix.add(i);
		  }
		  
		  int a = A.get(0);
		  gPrefix.add(a);		  
		  for(int i=1;i<A.size();i++)
		  {			  
			  int b = A.get(i);
			  int temp = getGCD(a, b);
			  gPrefix.add(temp);
			  a = temp;
		  }
		  
		  a = A.get(A.size() - 1);
		  gSuffix.set(A.size()-1, a);
		  
		  for(int i= A.size() -2;i>=0;i--)
		  {
			int b = A.get(i);
			int temp = getGCD(b, a);
			gSuffix.set(i, temp);
			a = temp;
		  }
		  
		  maxGCD = Math.max(gSuffix.get(1),gPrefix.get(A.size() -1));
		  
		  for(int i=1;i<A.size()-1;i++)
		  {
			int temp = getGCD(gPrefix.get(i-1),gSuffix.get(i+1));
			if(maxGCD < temp)
				maxGCD = temp;
		  }
		  return maxGCD;
		  
		  
	   }
	  private static int getGCD(int a, int b)
	  {
		   if(b == 0)return a;
		  return getGCD(b, a%b);
	  }
}
