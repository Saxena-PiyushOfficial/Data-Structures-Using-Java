package Circular_Queue;

public class CircularQueue {
	private int front, rear;
	private int queue[];
	private int max_size;
     private static int count=0;
	public CircularQueue(int max_size) {
		this.front = -1;
		this.rear = -1;
		this.max_size = max_size;
		this.queue = new int[max_size];
	}

	public void enqueue(int element) {
		if (isFull())
			System.out.println("queue is full");
		else {
			if (front == -1) {
				front = 0;
			     rear=0;
			}
			else if(rear==max_size-1)
			{
				rear=0;
			}
			else
				rear=rear+1;

			queue[rear] = element;
		}

	}

	public boolean isFull() {
		if (front == 0 && rear == max_size - 1) {
			return true;
		}
		if (front == rear + 1) {
		      return true;
		    }
		return false;
	}

	public boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	public int dequeue() {
		int element;
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		} 
		else {
			element = queue[front];
			if (front == rear) {
				front=-1;
				rear=-1;
			}
			else if(front==max_size-1)
				front=0;
			else
				front = front + 1;
		}
		return element;
	}

	public int countElements()
	{
		if(isEmpty()) 
				{
					System.out.println("CQueue is Empty");
				         return -1;
				}
		else 
		{
			 count=front;
			if(front<=rear)
			{
				for (int i = front; i <=rear; i++)
					count++;
			}
			else {
				for(int i=front;i<max_size;i++)
				count++;
			     for(int j=0;j<=rear;j++)
			    count++;
			}
		}
		return count;
		
	}
	public void display() {
		if(front==-1|| rear==-1)
			System.out.println("Queue is emppty");
		else if(front<=rear) {
		for (int i = front; i <=rear; i++)
			System.out.print(queue[i] + " ");
		}
		else {
			for(int i=front;i<max_size;i++)
				System.out.print(queue[i]+" ");
		for(int j=0;j<=rear;j++)
			System.out.print(queue[j]+" ");
		}
	}
}
