package overlapping.subproplems;

public class FibonacciSeries {

	public static void main(String[] args) {
		displayFib(5);
		// 1 1 2 3 5
		System.out.print(fib(5));
	}
	
	private static void displayFib(int N)
	{
		int current = 1,prev = 0;
		for(int i=1;i<N;i++)
		{					
			int temp = current;
			current = current + prev;
			prev = temp;
		}
		System.out.println(current);
	}
	
	private static int fib(int n)
	{
		if(n <=2)
			return 1;
		return fib(n-1) + fib(n-2);
	}
	

}
