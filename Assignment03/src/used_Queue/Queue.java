package used_Queue;

public class Queue {
	private int front, rear;
	private int queue[];
	private int max_size;

	public Queue(int max_size) {
		this.front = -1;
		this.rear = -1;
		this.max_size = max_size;
		this.queue = new int[max_size];
	}

	public void enqueue(int element) {
		if (isFull())
			System.out.println("queue is full");
		else {
			if (front == -1)
				front = 0;

			rear++;
			queue[rear] = element;
		}

	}

	public boolean isFull() {
		if (front == 0 && rear == max_size - 1) {
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
		} else {
			element = queue[front];
			if (front == rear) {
				System.out.println("Queue full");
				return -1;
			} else
				front++;
		}
		return element;
	}
	public int countElemets() {
		int count=0;
		if(isEmpty())
			return -1;
		else
		{
			for(int i=front;i<=rear;i++)
				count++;
		}
		return count;
		
	}
	public void display() {
		for (int i = front; i <= rear; i++)
			System.out.print(queue[i] + " ");
	}
}
