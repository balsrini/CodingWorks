package DPStrategy;

public class MinCostOfTravelDp1 {

	static int [][]cost = {{1,3,5,8},{4,2,1,7},{4,3,2,3}};
	static int minCost = Integer.MAX_VALUE;
	
	
	public static void main(String[] args) {
		int output = getMin(cost.length - 1, cost[0].length - 1);
		System.out.println(output);

	}

	private static int getMin(int i,int j)
	{
		if(i ==0 && j ==0)
			return cost[i][j];
		
		if(i == 0)
			return getMin(i,j-1) + cost[i][j];
		if(j==0)
			return getMin(i-1,j) + cost[i][j];
		
		int x = getMin(i-1,j);
		int y = getMin(i,j-1); 

		return Math.min(x, y) + cost[i][j];
		
	}
}
