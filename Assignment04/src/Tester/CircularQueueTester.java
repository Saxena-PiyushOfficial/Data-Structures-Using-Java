package Tester;

import java.util.Scanner;

import Circular_Queue.*;



public class CircularQueueTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the initial maximum size");
			CircularQueue ct=new CircularQueue(sc.nextInt()); 
			
			do {
				System.out.println("\n-----------Queue's Menu Driven Program---------");
				System.out.println("1.enqueue");
				System.out.println("2.dequeue");
				System.out.println("3.Display");
				System.out.println("4.Count");
				System.out.println("5.isFull");
				System.out.println("6.isEmpty");
				System.out.println("0.Exit");
				System.out.println("Choose option");
				int op=sc.nextInt();
				switch(op)
				{
				case 1:System.out.println("Enter the element to enqueue");
					ct.enqueue(sc.nextInt());
					break;
				case 2:
				System.out.println("Element dequed= "+ct.dequeue());
				break;
				case 3:System.out.println("Displaying queue");
				ct.display();
				break;
				case 4:System.out.println("The total number of elements in circular queue "+ct.countElements());
					break;
				case 5:System.out.println(ct.isFull());
					break;
				case 6:System.out.println(ct.isEmpty());
					break;
				case 0:System.out.println("Exiting......");
					System.exit(0);
				}
			} while (true);
		} 
			
		
	

	}

}
