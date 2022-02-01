package Assignment;

import java.util.LinkedList;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		sol.push(1);
		sol.push(2);
		sol.push(-2);
		System.out.println(sol.getMin());
		sol.pop();
		System.out.println(sol.getMin());
		System.out.println(sol.top());
		
		Solution sol1 = new Solution();
		System.out.println(sol1.getMin());
		sol1.pop();
		System.out.println(sol1.top());

	}

	static class Solution {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedList<Integer> minStack = new LinkedList<Integer>();
	    public void push(int x) {
	        ll.addFirst(x);
	        if(minStack.size() == 0)
	        	minStack.addFirst(x);
	        else
	        {
	        	int min = minStack.getFirst();
	        	if(min >= x)
	        		minStack.addFirst(x);
	        }
	    }

	    public void pop() {
	    	if(ll.size() == 0)
	    		return;
	    	
	        int x = ll.removeFirst();
	        if(minStack.size() != 0 )
	        {
	        	int min = minStack.getFirst();
	        	if(min == x)
	        		minStack.removeFirst();
	        }
	    }

	    public int top() {
	    	if(ll.size() == 0 )
	    		return -1;
	        return ll.getFirst();
	    }

	    public int getMin() {
	    	if(minStack.size() == 0 || ll.size() == 0)
	    		return -1;
	        return minStack.getFirst();
	    }
	}
}
