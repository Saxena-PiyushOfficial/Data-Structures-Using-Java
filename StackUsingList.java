package Basic_DSA;

import java.util.NoSuchElementException;

class stackLinkedList{
	
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public Node head=null;
	public Node top=null;
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void push(int data)
	{
		Node newNode=new Node(data);
	    if(isEmpty())
	    {
	    	head=newNode;
	    	top=head;
	    }
	    else
	    {
	    	 top.next=newNode;
		        top=newNode;
	    }
	       
	}
	public int pop()
	{
		int x=Integer.MIN_VALUE;
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		else if(head.next==null)
		{
			x=head.data;
			head=null;
			top=null;
		}
		else
		{
			Node p=head;
			while(p.next!=top)
			{
				p=p.next;
			}
			x=top.data;
			p.next=null;
			top=p;
		}
		return x;
			
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("head->null");
			return;
		}
		else
		{
			Node p=head;
			System.out.print("head->");
			while(p!=null)
			{
				System.out.print(p.data+"->");
				p=p.next;
			}
			System.out.print("null");
		}
	}	
}
public class StackUsingList {
    
	public static void main(String[] args) {
         stackLinkedList stl=new stackLinkedList();
         stl.push(10);
         stl.push(20);
         stl.push(30);
         stl.push(40);
         stl.push(50);
         stl.push(60);
         stl.display();
         System.out.println();
         System.out.println("The delete element is "+stl.pop());
         stl.display();
         System.out.println();
         System.out.println("The delete element is "+stl.pop());
         stl.display();
         System.out.println();
         System.out.println("The delete element is "+stl.pop());
         stl.display();
         System.out.println();
         System.out.println("The delete element is "+stl.pop());
         stl.display();
         System.out.println();
         System.out.println("The delete element is "+stl.pop());
         stl.display();
         System.out.println();
         System.out.println("The delete element is "+stl.pop());
         stl.display();
 
	}

}
