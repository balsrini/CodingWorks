import java.util.ArrayList;
import java.util.Arrays;

public class FindOddDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.addAll(Arrays.asList(1,2,2,3,1));
		System.out.println(solve(input));

	}
	public static int solve(ArrayList<Integer> A)
	{
		int odd= 0;;
		for(int a:A)
		{
			odd = odd ^ a;
		}
		return odd;
	}

}
