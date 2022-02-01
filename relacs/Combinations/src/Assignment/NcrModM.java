package Assignment;

public class NcrModM {

	public static void main(String[] args) {
		System.out.println(solve(41, 27, 143));

	}

	  public static int solve(int A, int B, int C) {
		int [][]arr = new int[A+1][B+1];
		for(int i=0;i<=A;i++)			
		{
			for(int j=0;j<=B;j++)
			{
				if(j==0 || j==i)
					arr[i][j] = 1;
				else if(j> i)
					arr[i][j] = 0;
				else
					arr[i][j] = (arr[i-1][j-1]%C + arr[i-1][j]%C)%C;
			}
		}
		
		return arr[A][B];
		
		
	    }
}
