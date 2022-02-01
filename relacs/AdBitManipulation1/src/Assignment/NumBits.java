package Assignment;

public class NumBits {

	public static void main(String[] args) {
		
		System.out.println(numSetBits(5));
	}

	  public static int numSetBits(int A) {
		  int count = 0,j=0;
		  while(j<32)
		  {
			  if( (A & (1<<j)) != 0)
				  count++;
			  j++;
		  }
		  return count;
			  
		  
	    }
	  
}
