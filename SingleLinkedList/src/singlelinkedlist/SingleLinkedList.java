package singlelinkedlist;

public class SingleLinkedList {
	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			current = newNode;
		}
	}

	public int countElements() {
		int count = 0;
		Node current;
		if (isEmpty())
			return -1;
		else {
			current = head;
			while (current != null) {
				count++;
				current = current.next;
			}
		}
		return count;
	}
  public void insertAtNthPosition(int data,int position)
  {
	  Node newNode=new Node(data);
	   Node current;
	  if(head==null) {
	        head=newNode;
	        System.out.println("No elements!!!!!So Inserting at First");
	  }
	  else
	  {
		  current=head;
		for(int i=1;i<position-1;i++)
		{
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
	  }  
  }
	public int deleteNode() {
		Node prep = null;
		Node current;
		int ele = -1;
		if (head == null) {
			System.out.println("Invalid!!!!!List is Empty");
		} else if (head.next == null) {
			ele = head.data;
			head = null;
		} else {
			current = head;
			while (current.next != null) {
				prep = current;
				current = current.next;
			}
			prep.next = null;
			ele = current.data;
		}
		return ele;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public int deleteFirst() {
		int ele = -1;
		if (isEmpty()) {
			System.out.println("Invalid!!!!!List is empty");
		} else {
			ele = head.data;
			head = head.next;
		}
		return ele;
	}

	public void display() {
		Node current = head;
		if (isEmpty())
			System.out.println("List is empty");

		System.out.print("head->");
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();

	}

}
