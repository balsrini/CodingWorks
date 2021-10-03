package DailyCoding;

import java.util.ArrayList;

/**
 * An XOR linked list is a more memory efficient doubly linked list. 
 * Instead of each node holding next and prev fields, it holds a field named both, 
 * which is an XOR of the next node and the previous node. 
 * Implement an XOR linked list; it has an add(element) which adds the element to the end, 
 * and a get(index) which returns the node at index.
 * @author Balaji
 *
 */
public class Daily6 {

	public static class Node
	{
		private String data;
		private long both	;
		@Override
		public String toString() {
		
			return data;
		}
	}
	public static class LinkedList
	{
		private ArrayList<Node> nodeMap;
		private Node root;
		
		
		public LinkedList() {
			
			nodeMap = new ArrayList<Node>();
		}
		public void add(String data)
		{
			if(root == null)
			{
				root = new Node();
				root.data = data;				
				nodeMap.add(root);
				return;
			}else
			{
				Node prevPrev = null;
				Node prev = root;				
				long prevId = 0;
				long temp = prevId ^ prev.both;
				while(temp != 0)
				{					
					prevPrev = prev;
					prev = nodeMap.get((int)temp);
					temp = prevId ^ prev.both;
				}
				
				Node newNode = new Node();
				newNode.data = data;
				int newNodId = nodeMap.size();
				nodeMap.add(newNode);				
				prev.both = (prevPrev != null)? (nodeMap.indexOf(prevPrev) ^ newNodId):newNodId ^ 0;
				newNode.both = 0 ^ nodeMap.indexOf(prev);
			}
		}		
		
	}
	
	public static void main(String []args)
	{
	LinkedList ll = new LinkedList();
	ll.add("one");
	ll.add("two");
	ll.add("three");
	
	}
	
	
	
}
