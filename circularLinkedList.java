package Basic_DSA;


class circularList{
	class Node{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	private Node last=null;
	private Node head=null;
	public boolean isEmpty() {
		return head==null;
	}
	public void addList(int data)
	{
		Node newNode=new Node(data);
           if(isEmpty())
           {
        	   head=newNode;
        	   last=newNode;
        	   head.next=head;
           }
           else
           {
        	   last.next=newNode;
        	   last=newNode;
        	   newNode.next=head;
           }
				
	}
	public int delete() {
		int x=Integer.MIN_VALUE;
		if(isEmpty())
		{
			System.out.println("list is empty");
			return -1;
		}
		else if(head.next==head)
		{
			x=head.data;
		head=null;	
		}
		else
		{
			x=last.data;
			Node p=head;
			while(p.next!=last)
			{
				p=p.next;
			}
			p.next=head;
			last=p;
		}
		return x;
	}
	public void display()
	{
		if(isEmpty())
		System.out.println("List is Empty what to display");
		else {
			Node p=head;
			System.out.print("head->");
			do {
				System.out.print(p.data+"->");
			    p=p.next;
			}while(p!=head);
			
			System.out.print("null");
		}
	}
}





public class circularLinkedList {

	public static void main(String[] args) {
	circularList cl=new circularList();
	cl.addList(120);
	cl.addList(20);
	  cl.addList(30);
	  cl.addList(40);
  cl.addList(30);
  cl.addList(40);
  cl.display();
  System.out.println();
  cl.delete();
  cl.display();
  System.out.println();
  cl.delete();
  cl.display();
  System.out.println();
  cl.delete();
  cl.display();
  System.out.println();
  cl.delete();
  cl.display();
  System.out.println();
  System.out.println( cl.delete());
  cl.display();
  System.out.println();
  System.out.println( cl.delete());
  cl.display();
  System.out.println();
  System.out.println( cl.delete());
 
  cl.display();

	}

}
