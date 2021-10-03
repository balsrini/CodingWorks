package DPStrategy;

public class MinCostOfTravelMemorization {

	static int [][]cost = {{1,3,5,8},{4,2,1,7},{4,3,2,3}};	
	static int [][]minCost = new int[cost.length][cost[0].length];
	
	public static void main(String[] args) {
		int retVal = findMin(cost.length -1,cost[0].length-1);
		System.out.println(retVal);

	}
	private static int findMin(int i,int j)
	{
		if(minCost[i][j] != 0 )
			return minCost[i][j];
		
		if(i ==0 && j ==0)
			minCost[i][j] = cost[i][j];		
		else if(i ==0)
			minCost[i][j] =  findMin(i,j-1) + cost[i][j];
		else if(j ==0)
			minCost[i][j] =  findMin(i-1,j) + cost[i][j];
		else
		{
		int x = findMin(i-1,j);
		int y = findMin(i,j-1);
		minCost[i][j] =  Math.min(x, y) + cost[i][j];
		}
		return minCost[i][j];
	}

}
