package Assignment;

import java.util.ArrayList;

public class Second {
	public static void main(String []args)
	{
		System.out.println(findBuzz(5));
	}
	
	public static ArrayList<String> findBuzz(int A)
	{
		ArrayList<String> retVal = new ArrayList<String>(A);
		for(int i=1;i<=A;i++)
		{
			if(i%15 == 0)
				retVal.add("FizzBuzz");
			else if(i%3 == 0)
				retVal.add("Fizz");
			else if(i%5 == 0)
				retVal.add("Buzz");
			else
				retVal.add(Integer.toString(i));
				
		}
		return retVal;
	}

}
