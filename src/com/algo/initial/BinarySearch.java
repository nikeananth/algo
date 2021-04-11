package com.algo.initial;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root=new Node(10);
		
		Node left=new Node(20);
		Node right=new Node(30);
		Node left2=new Node(40);
		Node right2=new Node(50);
		
		Node left3=new Node(60);
		Node right3=new Node(70);
		
		
		root.left=left;
		root.right=right;
	
		left.left=left2;
		left.right=right2;
		
		right.left=left3;
		right.right=right3;
		
		
		
	System.out.println(sum(root));
	
		
		
		
	}

	private static int sum(Node root) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			return 0;
		}
		
		
		return sum(root.left)+root.data+sum(root.right);
		
		
	}

}





class Node{
	
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		super();
		this.data = data;
	}
	
}