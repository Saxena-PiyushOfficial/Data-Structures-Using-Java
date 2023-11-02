package Stack_utils;

public class used_stack {
	private int max_size;
	private int stack[];
	private int top;
	

	public used_stack(int max_size) {
		this.max_size = max_size;
		this.stack = new int[max_size];
		this.top = -1;
	}

	public int peekcount() {
		if (top == -1) {
			System.out.println("stack is empty");
			return 0;
		} else {
			return top+1;
		}
	}

	public void push(int element) {
		if (isFull()) {
			/*
			 * max_size = max_size * 2; stack = Arrays.copyOf(stack, max_size);
			 */
			System.out.println("Stack Overflow");
		} else {
			top++;
			stack[top] = element;
		}
	}

	public int pop() {
		int element;
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}

		element = stack[top];
		top--;

		return element;
	}

	public boolean isFull() {
		return top == max_size - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void display() {
		for (int i = 0; i <= top; i++)
			System.out.print(stack[i] + " ");
		;
	}
}
