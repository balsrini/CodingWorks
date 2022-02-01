package Assignment;

public class LexMin {

	public static void main(String[] args) {
		int t= 'd' +'b';
		int e = 'b' + 'e';
		System.out.println(t);
		System.out.println(e);
		System.out.println(solve("scsecugqsb"));
	}
	
    public static String solve(String A) {
    	int i = getIndex(A, 0,1);
    	int j = getIndex(A, i+1,0);
    	String st = new String();
    	st+=A.charAt(i);
    	st+=A.charAt(j);
    	return st;
    }
    private static int getIndex(String A,int sIndex,int pos)
    {
    	char []ch = A.toCharArray();
    	int minVal = Integer.MAX_VALUE;
    	for(int i=sIndex;(i+pos)<ch.length;i++)
    	{
    		if((int)ch[i]  < minVal)
    		{
    			sIndex = i;
    			minVal = (int)ch[i];
    		}
    	}
    	return sIndex;
    	
    }
    
    
    

}
