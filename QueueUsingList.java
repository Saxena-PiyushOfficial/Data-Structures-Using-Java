package Basic_DSA;

class QueueList{
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
		   this.data=data;
		   next=null;
		}
	}
	private Node head=null;
	private Node front=null;
	private Node rear=null;
	 
	public boolean isEmpty()
	{
		return (front==null && rear==null);
	}
	public void enqueue(int data)
	{
		Node newNode=new Node(data);
	   if(isEmpty())
	   {
		   head=newNode;
		   front=head;
		   rear=head;
	   }
	   else
	   {
		  
		   rear.next=newNode;
		   rear=newNode;
	   }
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
		System.out.println();
		
	}
	public int dequeue()
	{
		int x=Integer.MIN_VALUE;
		if(isEmpty())
		{
			return -1;
		}
		else if(head.next==null)
		{
			x=head.data;
			head=null;
			front=null;
			rear=null;
		}
		else
		{
			x=head.data;
			head=head.next;
		
		}
		return x;
	}
}
public class QueueUsingList {

	public static void main(String[] args) {
		QueueList ql=new QueueList();
		ql.enqueue(10);
		ql.enqueue(20);
		ql.enqueue(30);
		ql.enqueue(40);
		ql.enqueue(50);
		ql.enqueue(60);
		ql.display();
        System.out.println("the deleted element is: "+ql.dequeue());
        ql.display();
        System.out.println("the deleted element is: "+ql.dequeue());
        ql.display();
        System.out.println("the deleted element is: "+ql.dequeue());
        ql.display();
        System.out.println("the deleted element is: "+ql.dequeue());
        ql.display();
        System.out.println("the deleted element is: "+ql.dequeue());
        ql.display();
        System.out.println("the deleted element is: "+ql.dequeue());
        ql.display();
        System.out.println("the deleted element is: "+ql.dequeue());
        ql.display();
	}
}
