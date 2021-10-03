package DPStrategy;

public class MinCostOfTravel {

	static int [][]cost = {{1,3,5,8},{4,2,1,7},{4,3,2,3}};
	static int minCost = Integer.MAX_VALUE;
	private static int row = cost.length;
	private static int col = cost[0].length;
	public static void main(String[] args) {
		findMin(0, 0, 0);
		System.out.println(minCost);
	}
	
	private static void findMin(int i,int j,int tempCost)
	{
		if(i > row || j > col)
			return ;
		
		tempCost = tempCost + cost[i][j];

		if(i == (row-1)  && j == (col-1))
		{				
			if(minCost > tempCost)
				minCost = tempCost;
		}		
		
		if((i+1) < row)
			findMin(i+1, j, tempCost);
		if((j+1) < col)
			findMin(i, j+1, tempCost);	 
		
	}
	

}

