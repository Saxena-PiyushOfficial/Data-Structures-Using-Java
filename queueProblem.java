package Basic_DSA;

import java.util.Scanner;

class circular_Queue{
	private int[] queueArray;
	private int front;
	private int rear;
	public int size;
	
	
	
	public int getSize() {
		return size;
	}
	public circular_Queue()
	{
		queueArray=new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	public circular_Queue(int maxSize)
	{
		queueArray=new int[maxSize];
		front=-1;
		rear=-1;
		size=0;
	}
	public boolean isEmpty()
	{
		return (front==-1);
	}
	public boolean isFull()
	{
		return (front==0 && rear==queueArray.length-1)||(front==rear+1);
	}
	public void addQueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return;
		}
		else {
			if(rear==-1)	
			{
				front=0;
				rear=0;
			}
			else if(rear==queueArray.length-1)
			{
				rear=0;
			}
			else
			{
				rear++;
			}
			queueArray[rear]=data;
			size++;
		}
	}
	public int deleteQueue()
	{
		int x=Integer.MIN_VALUE;
		if(isEmpty())
		{
			System.out.println("queue is empty can't delete");
			return -1;
		}
		else
		{
			x=queueArray[front];
			size--;
			if(front==queueArray.length-1)
			{
				front=0;
			}
			else if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else {
				front=front+1;
			}
		}
		return x;
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty.");
			return;
		}
		if(front<=rear)
		{
			for(int i=front;i<=rear;i++)
				System.out.print(queueArray[i]+" ");
		}
		else
		{
			for(int j=front;j<queueArray.length;j++)
			{
				System.out.print(queueArray[j]+" ");
			}
			for(int k=0;k<=rear;k++)
			{
				System.out.print(queueArray[k]+" ");
			}
		}
	}
}
public class queueProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
	circular_Queue cq=new circular_Queue(sc.nextInt());
	cq.addQueue(19);
	cq.addQueue(20);
	cq.addQueue(21);
	cq.addQueue(22);
	cq.addQueue(23);
	cq.display();
	System.out.println();
	cq.deleteQueue();
	cq.deleteQueue();
	cq.deleteQueue();
	cq.deleteQueue();
	cq.deleteQueue();

	cq.display();
	System.out.println();
	System.out.println(cq.getSize());;
	}

}
