package Homework;

public class KthSymbol {

	public static void main(String[] args) {
		
		System.out.println(solve(2,2));
		System.out.println(solve1(2,2));
		
		System.out.println(solve(4,2));
		System.out.println(solve1(4,2));

		
		System.out.println(solve(3,1));
		System.out.println(solve1(3,1));
		
		
		System.out.println(solve(5,5));
		System.out.println(solve1(5,5));


	}
	
	
	public static int solve1(int A, int B) 
	{
		return solve2(A,B-1);
	}
	
    public static int solve2(int A, int B) {
    	 if(B == 0) { return 0; }    	
     	int val = solve(A-1,(B )/2);
     	if(B%2 ==0)
     		return val ==0?0:1;
     	else
     		return (val ==0 )?1:0;
    }
    
    public static int solve(int A, int B) {

        if(A == 1 || B == 1) { return 0; }

        int pre = solve(A - 1, ( B + 1 ) / 2);

        if(pre == 0) {
            if((B & 1) == 1) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if((B & 1) == 1) {
                return 1;
            } else {
                return 0;
            }
        }
    }
  
}
