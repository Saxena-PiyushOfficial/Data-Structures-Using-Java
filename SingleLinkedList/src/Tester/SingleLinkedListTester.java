package Tester;

import java.util.Scanner;

import singlelinkedlist.SingleLinkedList;

public class SingleLinkedListTester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		
			SingleLinkedList lt=new SingleLinkedList(); 
			
			do {
				System.out.println("\n-----------Single Linked List Menu Driven Program---------");
				System.out.println("1.AddNode");
				System.out.println("2.DeleteNode");
				System.out.println("3.Display");
				System.out.println("4.Count");
				System.out.println("5.isEmpty");
				System.out.println("6.AddFirst");
				System.out.println("7.DeleteFirst");
				System.out.println("8.InsertAtNthPosition");
				System.out.println("0.Exit");
				System.out.println("Choose option");
				int op=sc.nextInt();
				switch(op)
				{
				case 1:System.out.println("Enter the element to add");
					lt.addNode(sc.nextInt());
					break;
				case 2:
				System.out.println("Element deleted = "+lt.deleteNode());
				break;
				case 3:System.out.println("Displaying stack");
				lt.display();
				break;
				case 4: System.out.println("Total elements in Linked List are:"+lt.countElements());
				break;
				case 5:
					System.out.println(lt.isEmpty());
					break;
				case 6:System.out.println("Enter the element to add at first");
				          lt.addFirst(sc.nextInt());
					break;
				case 7:
		          System.out.println("The element deleed from first is: "+ lt.deleteFirst());
			break;
				case 8:
					System.out.println("Enter the element and position");
			          lt.insertAtNthPosition(sc.nextInt(), sc.nextInt());
				break;
				case 0:System.out.println("Exiting......");
					System.exit(0);
				}
			} while (true);
		} 
			
		
	
	}
}
