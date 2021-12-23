package third;

public class Second {

	public static void main(String []args)
	{
		for(int x=1;x<10;x++)
		{
		int count = 0;
		int N=x;
		for(int i=0;i<N;i++)
		{
			for(int j = N;j>i;j--)
				count++;
		}
		
		System.out.println("x" + x + " count:" + count);
		}
	}
	
}
