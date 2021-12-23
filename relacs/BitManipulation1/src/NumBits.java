
public class NumBits {

	public static void main(String[] args) {
		System.out.println(solve(-11));

	}
	public static int solve(int a)
	{
		int count = 0;
		while(a != 0)
		{
			if( (a & 1 )%2 == 1)
				count++;
			a = a >>> 1;
		}
		return count;
	}

}
