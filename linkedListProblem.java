package Basic_DSA;


class LinkedList
{
	class Node{
		private int data;
		private Node next;
		
		
		
		public Node(int data)
		{
			this.data=data;
		    this.next=null;
		}
	}
	private Node head=null;
	
	
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void insert(int data)
	{
		Node newNode=new Node(data);
	    if(isEmpty())
	    {
	    	head=newNode;  
	    }
	    else {
	    	   Node currentNode=head;
	   	    while(currentNode.next!=null)
	   	    {
	   	    	currentNode=currentNode.next;
	   	    }
	   	    currentNode.next=newNode;   
	    }
	  
	}
	public int delete()
	{
		int x=Integer.MIN_VALUE;
		if(isEmpty())
			System.out.println("List is empty");
		else if(head.next==null)
		{
			x=head.data;
			head=null;
		}
		else
		{
			Node prev=null;
			Node p=head;
			while(p.next!=null)
			{
				prev=p;
				p=p.next;
			}
			x=p.data;
			prev.next=null;
		}
		return x;
	}
	public void addFirst(int data)
	{
		Node newNode=new Node(data);
		if(isEmpty())
			head=newNode;
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	public int deleteFirst()
	{
		int x=Integer.MIN_VALUE;
		if(isEmpty())
          return -1;
		else if(head.next==null)
		{
			x=head.data;
			head=null;
		}
		else
		{
			x=head.data;
			head=head.next;
		}
		return x;
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("head->null");	
		}
		else
		{
			Node p=head;
			System.out.print("head->");
			while(p.next!=null)
			{
				System.out.print(p.data+"->");
				p=p.next;
			}
			System.out.print(p.data+"->");
			System.out.print("null");
		}
	}
	public int count()
	{
		int count=0;
		if(isEmpty())
		{
			return 0;	
		}
		else
		{
			Node p=head;
		
			while(p!=null)
			{
				count++;
				p=p.next;
			}
	
		}
	return count;	
	}
	public void insertInSortedPosition(int data) {
		  Node newNode = new Node(data);
		    if (isEmpty() || head.data >= newNode.data) {
		        newNode.next = head;
		        head = newNode;
		    } else {
		        Node p = head;
		        while (p.next != null) {
		         if(p.next.data < newNode.data)
		            p = p.next;
		        }
		        newNode.next = p.next;
		        p.next = newNode;
		    }
	}
	public boolean isSorted()
	{
		  int flag = 0;
		    if (isEmpty()) {
		        System.out.println("Empty");
		    } else {
		        Node p = head;
		        while (p.next != null) {
		            if (p.data > p.next.data) { 
		                flag = 1;
		                break;
		            }
		            p = p.next;
		        }
		    }
		    if (flag == 1)
		        return false;
		    else
		        return true;
	}
	public int sum()
	{
		int sum=0,max=0;
		if(isEmpty())
		{
			return 0;	
		}
		else
		{
			Node p=head;
		
			while(p!=null)
			{ 
				if(max<p.data)
					max=p.data;
			sum+=p.data;
				p=p.next;
			}
	
		}
		System.out.println("Maximum element is "+max);
	return sum;	
	}
	public int removeNthNode(int x)
	{	
		int ele = Integer.MIN_VALUE;

	    if (isEmpty()) {
	        System.out.println("No element to remove");
	    } else if (x <= 0) {
	        System.out.println("Invalid position");
	    } else {
	        Node p = head;
	        Node prev = null;
	        int count = 1;

	        while (p != null && count < x) {
	            prev = p;
	            p = p.next;
	            count++;
	        }

	        if (p == null) {
	            System.out.println("Position " + x + " does not exist");
	        } else {
	            ele = p.data;
	            if (prev == null) {
	                head = p.next;
	            } else {
	                prev.next = p.next;
	            }
	        }
	    }
	    return ele;
	
	}
	public int middleElement()
	{
		int x=-1;
		int len=0;
	if(count()%2!=0)
		len=(count()+1)/2;
	else
		len=count()/2;
	
		if(isEmpty())
			System.out.println("Empty");
		else {
			Node p=head;
			for(int i=1;i<len;i++)
			{	
			 p=p.next;
			}	
			 x=p.data;
		}
		return x;
	}
public void reverse()
{
	if(isEmpty())
	{
		System.out.println("head->null");
		return;
	}
	else
	{
		Node q=null,r=null;
		Node p=head;
		while(p!=null)
		{
			r=q;
			q=p;
			p=p.next;
			q.next=r;
		}
		
		head=q;
	}
		
}

}
public class linkedListProblem {

	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.insert(10);
		ls.insert(20);
		ls.insert(30);
		ls.insert(40);
		ls.insert(50);
		ls.insert(60);
//		ls.insert(70);
		ls.display();
//		ls.insertInSortedPosition(70);
		System.out.println();
//		ls.display();
//		System.out.println();
//		System.out.println(ls.isSorted());
		//ls.reverse();
//		ls.display();
		//System.out.println("The number of nodes is:"+ls.count());
//		System.out.println("The sum of nodes is:"+ls.sum());
		//System.out.println("The first element that is deleted is: "+ls.deleteFirst());
		//ls.display();
		//System.out.println();
      System.out.println("The middle element is: "+ls.middleElement());
     System.out.println(ls.removeNthNode(1));
     ls.display();
	}
}
