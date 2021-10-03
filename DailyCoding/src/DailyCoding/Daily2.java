package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Daily2 {

	/**
	 * Given the root to a binary tree, 
	 * implement serialize(root), which serializes the tree into a string, and deserialize(s), 
	 * which deserializes the string back into the tree. For example, given the following Node class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Node root = Node("root", Node("left",Node("left.left")), Node("right"));
		String str = Node.serialize(root);
		Node root1 = Node.deserialize(str);
		System.out.println(root1.left.left.data);

	}
	public static Node Node(String data, Node left, Node right)
	{
		return new Node(data,left,right);
	}
	
	public static Node Node(String data)
	{
		return Node(data,null,null);
	}
	
	public static Node Node(String data,Node left)
	{
		return Node(data,left,null);
	}


	private static String DELIM = ",";
	public static class Node
	{
		private Node left;
		private Node right;
		private String data;
				
		public Node(String data, Node left,Node right)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		public Node()
		{
			this.data = null;
			this.left= null;
			this.right= null;
		}

		public int getLength()
		{
			return 1 + (this.left != null?this.left.getLength():0) + (this.right!= null ? this.right.getLength():0);
		}
		
		public static String serialize(Node node)
		{			
			int len = node.getLength();
			String[] nodeList = new String[len];			
			Arrays.fill(nodeList, null);
			flattenNode(node, nodeList, 0);
			StringBuilder sb = new StringBuilder();
			Arrays.asList(nodeList).stream().forEach(data -> {sb.append(data); sb.append("#");});
			return sb.toString();
		}
		
		private static void flattenNode(Node node,String[] nodeList,int nodeIndex)
		{
			nodeList[nodeIndex] =  node.data;
			if(node.left != null)
				flattenNode(node.left, nodeList, nodeIndex*2 + 1);				
			if(node.right != null)
				flattenNode(node.right, nodeList, nodeIndex*2 + 2);
		}
		
		
		public static Node deserialize(String str)
		{
			StringTokenizer tokens = new StringTokenizer(str,"#",false);
			ArrayList<String> list = new ArrayList<String>(tokens.countTokens());
			while(tokens.hasMoreElements())
			{
				list.add(tokens.nextToken());
			}
			return getNode(list, 0);		
			
		}
		
		private static Node getNode(ArrayList<String> list,int i)
		{	
			Node temp = new Node();
			if(i >= list.size())
				return null;
			
			temp.data = list.get(i);
			
			int left = i*2 + 1;
			int right = i*2 + 2;
			temp.left = getNode(list, left);
			temp.right = getNode(list, right);
			return temp;
			
		}
	}
	
	

}


