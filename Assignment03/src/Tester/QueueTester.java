package Tester;

import java.util.Scanner;

import used_Queue.Queue;



public class QueueTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the initial maximum size");
			Queue qt=new Queue(sc.nextInt()); 
			
			do {
				System.out.println("\n-----------Queue's Menu Driven Program---------");
				System.out.println("1.enqueue");
				System.out.println("2.dequeue");
				System.out.println("3.Display");
				System.out.println("4.isFull");
				System.out.println("5.isEmpty");
				System.out.println("6.Count");
			
				System.out.println("0.Exit");
				System.out.println("Choose option");
				int op=sc.nextInt();
				switch(op)
				{
				case 1:System.out.println("Enter the element to enqueue");
					qt.enqueue(sc.nextInt());
					break;
				case 2:
				System.out.println("Element dequed= "+qt.dequeue());
				break;
				case 3:System.out.println("Displaying queue");
				qt.display();
				break;
				case 4:
					System.out.println(qt.isFull());
					break;
				case 5:System.out.println(qt.isEmpty());
					break;
				case 6:System.out.println("The number of elements in queue are "+qt.countElemets());
					break;
				case 0:System.out.println("Exiting......");
					System.exit(0);
				}
			} while (true);
		} 
			
		
	

	}

}
