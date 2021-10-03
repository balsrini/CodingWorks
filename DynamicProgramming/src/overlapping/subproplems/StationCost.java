package overlapping.subproplems;

public class StationCost {

	private static int [][]arr = new int[][] { {0,12,75,94},
											   {-1,0,35,50},
											   {-1,-1,0,80},
											   {-1,-1,-1,0}};									

	public static void main(String[] args) {		
									
		System.out.println(calculateMinCost(0, 3));
		
		
	}
	
	private static int calculateMinCost(int source, int destination)
	{
		if(source == destination )
			return 0;
		
		if( (source+1) == destination)
			return arr[source][destination];
		
		int lowCost = Integer.MAX_VALUE;
		for(int i=source;i<destination;i++)
		{
			int temp1 = arr[source][i+1];
			int temp2 = calculateMinCost(i+1, destination);
			int temp = temp1 + temp2;
 			if(temp < lowCost)
				lowCost = temp;
		}		
		return lowCost;
		
	}
	
	

}
