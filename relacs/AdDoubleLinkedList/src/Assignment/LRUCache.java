package Assignment;

import java.util.HashMap;

public class LRUCache {

	public static void main(String[] args) {
		Solution s = new Solution(2);
		s.set(1, 10);
		s.set(5, 12);
		System.out.println(s.get(5));
		System.out.println(s.get(1));
		System.out.println(s.get(10));
		s.set(6, 14);
		System.out.println(s.get(5));
	}
	

	public static class Solution
	{
		private Node head;
		private HashMap<Integer,Node> hm ;
		private int size;
		private class Node 
		{
			private int key;
			private int val;
			public Node(int k,int v)
			{
				this.key = k;
				this.val = v;
			}
			private Node next;
			private Node prev;
			public int getVal() {
				return val;
			}
			public void setVal(int val) {
				this.val = val;
			}
			public Node getPrev() {
				return prev;
			}
			public void setPrev(Node prev) {
				this.prev = prev;
			}

			public void remove()
			{
				if(this.prev != null)
					this.prev.next = this.next;
				if(this.next != null)
					this.next.prev = this.prev;
				this.prev = null;
				this.next = null;
			}

			public void addToEnd(Node n)
			{
				Node t = this;			
				while(t.next != null)
				{
					t= t.next;
				}
				t.next = n;
				n.prev = t;			
			}
		}
		public Solution(int capacity) {
			size = capacity;
			hm = new HashMap<Integer, Node>(capacity);
		}

		public int get(int key) {
			Node ret = hm.get(key);
			if(ret == null)
				return -1;
			touch(key);
			return ret.getVal();
		}
		
		public void touch(int key)
		{
			Node ret = hm.get(key);
			if(ret == null || ret.next == null)
				return;			
			
			if(ret.prev == null)
			{
				head = ret.next;	        		        	
			}
			ret.remove();
			if(head != null)
				head.addToEnd(ret);
			else
				head  = ret;			
			
		}

		public void set(int key, int value) {
			Node ret = hm.get(key);
			if(ret == null)
			{
				ret =  new Node(key,value);		
				hm.put(key, ret);
				if(head == null)
				{
					head =ret;				
					return;	  
				}
			}
			else
				ret.setVal(value);
			touch(key);
		}
	}
}
