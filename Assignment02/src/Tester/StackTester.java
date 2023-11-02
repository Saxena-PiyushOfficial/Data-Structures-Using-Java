package Tester;

import java.util.Scanner;

import Stack_utils.used_stack;

public class StackTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the initial maximum size");
			used_stack st=new used_stack(sc.nextInt()); 
			
			do {
				System.out.println("\n-----------Stack's Menu Driven Program---------");
				System.out.println("1.Push");
				System.out.println("2.Pop");
				System.out.println("3.Display");
				System.out.println("4.Count");
				System.out.println("5.isFull");
				System.out.println("6.isEmpty");
				System.out.println("0.Exit");
				System.out.println("Choose option");
				int op=sc.nextInt();
				switch(op)
				{
				case 1:System.out.println("Enter the element to push");
					st.push(sc.nextInt());
					break;
				case 2:
				System.out.println("Element popped = "+st.pop());
				break;
				case 3:System.out.println("Displaying stack");
				st.display();
				break;
				case 4: System.out.println("Total elements in stack are:"+st.peekcount());
				break;
				case 5:  
				
						System.out.println(st.isFull());
					
					break;
				case 6:
					System.out.println(st.isEmpty());
				
					
					break;
				case 0:System.out.println("Exiting......");
					System.exit(0);
				}
			} while (true);
		} 
			
		
	}
	
}
