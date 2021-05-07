package com.linkedList;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import javax.print.attribute.HashAttributeSet;


public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Node n=new Node(3); n.appendNode(5); n.appendNode(8); n.appendNode(5);
		 * n.appendNode(10); n.appendNode(2); n.appendNode(1);
		 */
		  

		NodeTwo commonNodes = null;
		 int[] commonData = {80, 90, 100};
		    
		 for (int i = 0; i < commonData.length; i++){
			 NodeTwo node = new NodeTwo(commonData[i]);
			 node.setNextNode(commonNodes);
	            commonNodes = node;
		 }

		 
		 NodeTwo node1 = commonNodes;
	        int[] firstListData = {1, 2, 3};
	        for (int i = 0; i < firstListData.length; i++){
	        	NodeTwo node = new NodeTwo(firstListData[i]);
	            node.setNextNode(node1);
	            node1 = node;
	        }
	        
	        
	        NodeTwo node2 = commonNodes;
	        int[] secondListData = {4, 5};
	        for (int i = 0; i < secondListData.length; i++){
	        	NodeTwo node = new NodeTwo(secondListData[i]);
	            node.setNextNode(node2);
	            node2 = node;
	        }
	        
	        NodeTwo n=new NodeTwo(1);
	     //   n.findIntersection(node1,node2);
	        
	        n.findIntersection1(node1,node2);
				/*
				 * Node n2=new Node(1); n2.appendNode(2); n2.appendNode(2); n2.appendNode(2);
				 * n2.appendNode(2); n2.appendNode(2); n2.appendNode(2); n2.appendNode(2);
				 * n2.appendNode(1);
				 */
				    //321
				    //321
				   // n.addTwoNum(n1,n2,0);
				  //  int data=n.addTwoNumRev(n1,n2,0);
				   // System.out.println(data);
				    
				    //Node h2=n.isPalindrome(n2);
				    
				    
				  //  n.isPalindromeRecursive(n2,9);
				   // n.printNode(h2);
				    
		  //  System.out.println(n.partition(n, 5).data);
		   // n.printNode(n);
		   // n.removeDuplicate(n);
		   // n.removeDuplicateNod(n);
		   // n.printNode(n);
		  //  n.deleteNode(n,30);
		   // n.printNode(n);
		   // n.printKthToLast(n,3);
		  //  n.findLength(n,n);
		   // Node n2=n.nthTolast(n,3);
		   // System.out.println(n2.data);
		    
	}



}

 class NodeTwo {

    private int data;
    private NodeTwo nextNode;
    
    
	public NodeTwo(int data) {
		super();
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public NodeTwo getNextNode() {
		return nextNode;
	}
	public void setNextNode(NodeTwo nextNode) {
		this.nextNode = nextNode;

	}
	
	 public void findIntersection1(NodeTwo node11,NodeTwo node12) {
		 
		 NodeTwo node1=node11;
		 NodeTwo node2=node12;
		 int node1Count=0;
		 int node2Count=0;
		 while(node1!=null) {
			 node1Count++;
			 node1=node1.nextNode;
		 }
		 while(node2!=null) {
			 node2Count++;
			 node2=node2.nextNode;
		}
		 
		String nodeType= node1Count>node2Count?"1":"2";
		
		int totCount=Math.max(node1Count, node2Count)-Math.min(node1Count, node2Count);
		
		int count=0;
		if(nodeType.equals("1")) {
			 while(node11!=null) {
				 if(totCount==count) {
					 break;
				 }
				 count++;
				 node11=node11.nextNode;
			 }		
		}
		else {
			 while(node12!=null) {
				 if(totCount==count) {
					 break;
				 }
				 count++;               
				 node12=node12.nextNode;
			 }	
		}
		
		while(node11!=null && node12!=null) {
			
			if(node11==node12) {
				System.out.println("mapped");
			}
			node11=node11.nextNode;
			node12=node12.nextNode;
		}
		 
	 }
	
	 public void findIntersection(NodeTwo node1,NodeTwo node2) {
		   
		 HashSet<NodeTwo> hs=new HashSet<>();
		 while(node1!=null) {
			 hs.add(node1);
			 node1=node1.nextNode;
		 }
		 while(node2!=null) {
			
			 if(hs.contains(node2)) {
				 System.out.println("intersection"+node2.data);
			 }
			 else {
				 hs.add(node2);  
			 }
			 node2=node2.nextNode;
		 }
		
		 
	  }

//setters and getters

}

class Node{
	
	Node next=null;
	int data;
	
	Node(int data){
		this.data=data;
	}
	
	Node appendNode(int data) {
		Node node=new Node(data);
		Node n=this;
		while(n.next!=null) {
			n=n.next;
		}		
		n.next=node;
		
		return n;
	}
	
	void printNode(Node n) {
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
	
	void printNode1(Node n) {
		
		
		while(n.next!=null) {
			System.out.println(n);
			n=n.next;
		}

	}
	
	Node deleteNode(Node head,int data) {
		
		while(head.next!=null) {
			
			if(head.next.data==data) {
				head.next=head.next.next;
				break;
			}
			
			head=head.next;
		}
		
		return head;
	}
	
	
   void removeDuplicate(Node node) {
	   
	   Node prev = null;
	   Set hm=new HashSet();
	   while(node!=null) {
		  
		   if(hm.contains(node.data)&&node.next!=null) {
			   prev.next=node.next;			   
		   }
		   else {
			    hm.add(node.data);
			    prev=node;
		   }
		  
		   node=node.next;
	   }
	   
   }
   
   
   
 void removeDuplicateNod(Node node) {
	 Node current=null;
	 
	 while(current!=null) {
		 
		 
		 Node runner=current;
		 while(runner.next!=null) {
			 
			 if(runner.data==runner.next.data) {
				 runner.next=runner.next.next;
			 }else {
				 runner=runner.next;
			 }
		 }
		 
		 
		 current=current.next;
	 }
	 
	 
	   
   }
 
 
 int printKthToLast(Node head, int k) {
	 if(head==null) {
		 return 0;
	 }
	
	 int index=printKthToLast(head.next,k);
	 index=index+1;
	 if(index==k) {
		 System.out.println(head.data);
	 }
	 return index;

	 
 }

 Node findLength(Node node,Node nod1) {
	 
	 int count=0;
	 while(node!=null) {
		 count++;		 
		 node=node.next;
	 }
	 
	 System.out.println(count);
	 
	 int k=2;
	 
	 int kth=count-k;
	 count=0;
	 while(nod1!=null) {
		 count++;
		 if(count==kth) {
			 System.out.println(nod1.data);
			 break;
		 }
		 nod1=nod1.next;
		 
	 }
	 
	return null;
	 
	 
 }

 
 Node nthTolast(Node head, int k) {
	 Node p1=head;
			 Node p2=head;
	 for(int i=0;i<k;i++) {
		 p1=p1.next;
	 }
	
	 p2=head;
	 
	 while(p1!=null) {
		 
		 p1=p1.next;
		 p2=p2.next;
	 }
	 
	 return p2;

 }  
 
 
 Node partition(Node node,int x) {
	 Node beforeStart=null;
	 Node beforeEnd=null;
	 Node afterStart=null;
	 Node afterEnd=null;
	 
	 
	 while(node!=null) {
		 Node next=node.next;
		 node.next=null; 
		 if(node.data<x) {
			 
			 if(beforeStart==null) {
				 beforeStart=node;
				 beforeEnd=beforeStart;
			 }else {				 
				 beforeEnd.next=node;
				 beforeEnd=node;
			 }
         }
		 else {
			 if(afterStart==null) {
				 afterStart=node;
				 afterEnd=afterStart;
			 }
			 else {
				 afterEnd.next=node;
				 afterEnd=node;
			 }
		 }
			node=next; 
		 }
	 
		
		 beforeEnd.next=afterStart;
		 return beforeStart;
		
 }
 
 
 Node partition1(Node node,int x) {
	 Node head=node;
	 Node tail=node;
	 
	 while(node!=null) {
		 
		 Node next=node.next;
		 if(node.data<x) {
			 
			 node.next=head;
			 head=node;
		 }else {
			 tail.next=node;
			 tail=node;
		 }
		 node=next;
		 
		 
	 }
	 tail.next=null;
	 
return head;
 }
 
 
     int addTwoNum(Node node1,Node node2,int carry) {
    	 
    	 if(node1==null&&node2==null&&carry==0) {
    		 return 0;
    	 }
    	 //123-321
    	 //123-321
    	 //---
    	 //246
    	 int data =node1.data+node2.data;
    	 System.out.println(data);
    	 addTwoNum(node1.next,node2.next,data>10?1:0);
    	 
    	 
    	 
    	 
    	 
		return 1;
    	 
     }
     
     
int addTwoNumRev(Node node1,Node node2,int carry) {
    	 
    	 if(node1==null&&node2==null) {
    		 return 0;
    	 }
    	 //123-123
    	 //123-123
    	 //---
    	 //246
    
    	 int bal=addTwoNumRev(node1.next,node2.next,carry);
    	 
    	 int data =node1.data+node2.data+bal;
    	 System.out.println(data%10);
    	  bal=data>10?1:0;

    	 
		return bal;
    	 
     }
  

Node isPalindrome(Node node) {
	
	
	Node head=node;
	while(node!=null) {
		Node n1=new Node(node.data);
	    
		n1.next=head;
		head=n1;
		
		node=node.next;
	}
	

	
	
	return head;
	
}



boolean isEqual(Node one, Node two) {
	
	while(one!=null&&two!=null) {
		if(one.data!=two.data)
		{
			return false;
		}
		one=one.next;
		two=two.next;
	}
	return true;
	
}


   boolean palindrome(Node head) {
	   
	   Node slow=head;
	   Node fast=head;
	   
	   Stack<Node> stk=new Stack();
	   
	   while(fast!=null&&fast.next!=null) {
		   stk.push(slow);
		   slow=slow.next;
		   fast=fast.next.next;
	   }
	   
	   
	   while(slow!=null) {
		   Node s=stk.pop();
		   if(s.data!=slow.data) {
			   return false;
		   }
		   slow=slow.next;
	   }
	   return true;
   }
   
   
   Node isPalindromeRecursive(Node head,int length){
	   
	   //if(head==null|| )
	   
	   if(head==null||length<=0) {
		   return head;
	   }
	   else if(length==1) {
		   return head.next;
	   }
	   
	   //1221
	   System.out.println(head.data);
	  Node res= isPalindromeRecursive(head.next,length-2);
	   
	   //System.out.println(head.data);
	   
	  Node n2=res;
	   if(head.data==n2.data) {
		   System.out.println("equal");
	   }
	   else {
		   System.out.println("wat");
	   }
	   
	   n2=n2.next;
	   return n2;
   }


	

}
