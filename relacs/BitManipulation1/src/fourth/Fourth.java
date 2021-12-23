package fourth;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalTestCase = 0;
		int [][]arr = new int[0][0];
		if(sc.hasNext())
		{
			totalTestCase = sc.nextInt();
			arr = new int[totalTestCase][];
			for(int t=0;t<totalTestCase;t++)
			{
				int arrSize = sc.nextInt();
				arr[t] = new int[arrSize];
				for(int i=0;i<arrSize;i++)
				{
					arr[t][i]= sc.nextInt();
				}
			}
		}
		for(int i=0;i<totalTestCase;i++)
		{
			int odd =0,even = 0;
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j] %2 == 0)
					even++;
				else
					odd++;
			}
			System.out.println(Math.abs(odd - even));
		}		
	}

}
