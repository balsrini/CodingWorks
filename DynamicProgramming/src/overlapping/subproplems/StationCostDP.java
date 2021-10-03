package overlapping.subproplems;

public class StationCostDP {

	private static int [][]arr = new int[][] { {0,12,75,94},
											   {-1,0,35,50},
											   {-1,-1,0,80},
											   {-1,-1,-1,0}};
	private static int []minCost = new int[] {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
	public static void main(String[]args)
	{
		System.out.println(findMinCost(0, 3));
	}
			
	public static int findMinCost(int source, int destination)
	{
		if(source == destination)
			return 0;
		if(destination == source+1)
			return arr[source][destination];
		
		if(minCost[destination] != Integer.MAX_VALUE)
			return minCost[destination];		
		
		for(int i=destination-1;i>source;i--)
		{
		int temp = findMinCost(source, i);
		int minTemp = temp + arr[i][destination];
		minCost[destination] = minCost[destination] <= minTemp?minCost[destination]:minTemp;
		}
		return minCost[destination];
		
	}
	
	
	
       	
									

}
