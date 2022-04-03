package Assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LinkedList {	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);		
//		String st = sc.nextLine();
//		Integer count = Integer.parseInt(st);
//		for(int i=0;i<count;i++)
//		{
//			st = sc.nextLine();
//			if(st.equals("p"))
//				print_ll();
//			else
//			{
//				StringTokenizer token = new StringTokenizer(st," ",false);
//				String op = token.nextToken();
//				if(op.equals("i"))
//				{
//					int pos = Integer.parseInt(token.nextToken());
//					int val = Integer.parseInt(token.nextToken());
//					insert_node(pos, val);
//				}else
//				{
//					int pos = Integer.parseInt(token.nextToken());
//					delete_node(pos);
//				}
//			}		
//		}
		
		insert_node(1, 3);
		insert_node(2, 2);
		insert_node(1, 1);
		print_ll();

	}
	
	private static ListNode head = null;
	public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer		
		if(head == null)
		{
			head = new ListNode(value);
			return;
		}
		if(position == 1)
		{
			ListNode val = new ListNode(value);
			val.next = head;
			head = val;
			return;
		}
		int k = 1;
		ListNode val = new ListNode(value);
		ListNode lNode = head;
		while(k<position-1 && lNode != null)
		{
			lNode = lNode.next;
			k++;
		}
		ListNode temp = lNode.next;
		lNode.next = val;
		val.next = temp;		
		
    }

    public static void delete_node(int position) {
        // @params position, integer
    	if(head == null)
    		return ;
    	if (position == 1)
    	{
    		head = head.next;
    		return;
    	}
    	int k = 1;
    	ListNode lNode = head;
    	while(k<position-1 && lNode != null)
    	{    		
    		lNode = lNode.next;
    		k++;
    	}
    	if(k <= position && lNode != null && lNode.next != null)
    		lNode.next = lNode.next.next;   		
    	
    }

    public static void print_ll() {
        // Output each element followed by a space
    	System.out.println();
    	ListNode lNode = head;    	
    	int i = 1;
    	while(lNode != null)
    	{
//    		if(arr.get(i) != lNode.val)
//    		{
//    			System.out.println("error");
//    		}
    		System.out.print(i + ": " + lNode.toString());
    		System.out.print(" ");
    		lNode = lNode.next;
    		i++;
    	}
    	
    }


}


