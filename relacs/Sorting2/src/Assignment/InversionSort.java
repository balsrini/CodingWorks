package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class InversionSort {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(10,3,8,15,6,12,2,18,7,1))));
	}

	 public static int solve(ArrayList<Integer> A) {
		 int  r =  mergeSort(A, 0, A.size() -1 );
		 return r;
	    }
	 
	 private static int mergeSort(ArrayList<Integer> A,int start, int end)
	 {
		 if(start == end)
			 return 0;
		 int m = (start + end)/2;
		 int l = mergeSort(A, start, m);
		 int r = mergeSort(A, m+1, end);
		 int sum =  merge(A,start,m,end);
		 return l + r + sum;
	 }
	 
	 private static int merge(ArrayList<Integer> A,int start, int middle,int end)
	 {
		 ArrayList<Integer> temp = new ArrayList<Integer>();
		 int c = 0;
		 int p1 = start, p2 = middle+1;
		 while(p1<=middle && p2<=end)
		 {
			 if(A.get(p1) < A.get(p2)) {
				 temp.add(A.get(p1));
				 p1++;			
			 }else
			 {
				 temp.add(A.get(p2));
				 p2++;
				 c = c + (middle - p1 + 1);
			 }			 
		 }
		 while(p1<=middle)
		 {
			 temp.add(A.get(p1));
			 p1++;
		 }
		 while(p2<=end)
		 {
			 temp.add(A.get(p2));
			 p2++;
		 }
		 
		 for(int i=0;i<temp.size();i++)
		 {
			 try
			 {
			 A.set(i+start, temp.get(i));
			 }catch(IndexOutOfBoundsException ioe)
			 {
				 ioe.printStackTrace();
			 }
		 }
		 
		 return c;
	 }
}
