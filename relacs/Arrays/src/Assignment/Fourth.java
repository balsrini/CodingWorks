package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext())
		{
			int len = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i=0;i<len;i++)
			{
				arr.add(sc.nextInt());
			}
			int rotation = sc.nextInt();			
			int newRotation = len - rotation%len; 		
			for(int j=0;j<len;j++) 
			{
				int k = (j+newRotation)%len ;
				System.out.print(arr.get(k) +" ");
			}
			
		}
	}

}
