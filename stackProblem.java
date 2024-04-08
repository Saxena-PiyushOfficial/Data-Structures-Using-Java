package Basic_DSA;

import java.util.Scanner;

class stack_Imple{
    private int top;
    private int[] stackArray;
    
    public stack_Imple() {
		stackArray=new int[10];
		this.top=-1;
	}
    public stack_Imple(int maxSize)
    {
    	stackArray=new int[maxSize];
    	this.top=-1;
    }
    public boolean isEmpty()
    {
    	return (this.top==-1);
    }
    public boolean isFull()
    {
    	return this.top==stackArray.length-1;
    }
    public int minElement()
    {
    	int min=stackArray[0];
    	
    	if(isEmpty())
    	{
    		System.out.println("Empty no min element");
    		return -1;
    	}
    	else
    	{
    		for(int i=0;i<=top;i++)
    		{
    			if(stackArray[i]<min)
    				min=stackArray[i];
    		}
    		
    	}
    	return min;
    }
    public void push(int data)
    {
    	if(isFull())
    	{
    		System.out.println("stack is overflow");
    		return;
    	}
    	top++;
    	stackArray[top]=data;
    }
    public int peek()
    {
    	if(isEmpty())
    	{
    		System.out.println("stack is empty");
    		return -1;
    	}
    	return stackArray[top];
    }
    public int pop()
    {
    	int x=Integer.MIN_VALUE;
    	x=stackArray[top];
    	if(isEmpty())
    	{
    		System.out.println("Stack is underflow");
    		return -1;
    	}
         top--;	
    	return x;
    }
    public void display()
    {
    	if(isEmpty())
    	{
    		System.out.println("Stack is empty.Top= "+top);
    		return;
    	}
    	else {
    		for(int i=0;i<=top;i++)
    		{
    			System.out.print(stackArray[i]+" ");
    		}
    		
    	}
    	
    }
}
public class stackProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stack_Imple st=new stack_Imple();
		st.push(10);
		st.push(3);
		st.push(40);
		st.push(50);
		st.display();
		System.out.println();

		st.display();

	
		System.out.println(st.minElement());
		System.out.println(st.peek());

	}

}
