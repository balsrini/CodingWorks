package DPStrategy;

public class MinCostOfTravelTopDown {

	static int [][]cost = {{1,3,5,8},{4,2,1,7},{4,3,2,3}};	
	static int [][]minCost = new int[cost.length][cost[0].length];
	static int rows = cost.length;
	static int cols = cost[0].length;
	public static void main(String []args)
	{
		int retVal = findMin();
		System.out.println(retVal);
	}

	private static int findMin()
	{
		minCost[0][0] = cost[0][0];
		for(int i =1;i<rows;i++)
		{
			minCost[i][0] = minCost[i-1][0] + cost[i][0];
		}
		for(int j=1;j<cols;j++)
		{
			minCost[0][j] = minCost[0][j-1] + cost[0][j];
		}
		
		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<cols;j++)
			{
				minCost[i][j] = Math.min(minCost[i][j-1],minCost[i-1][j]) + cost[i][j];
			}
		}
		
		return minCost[rows - 1][cols-1];
		
	}

}
