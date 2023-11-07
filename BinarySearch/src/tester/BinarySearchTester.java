package tester;

import static binarysearch.BinarySearch.*;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the count of array");
			array = new int[sc.nextInt()];
			do {
				System.out.println("\n---------------Binary Search Menu Driven Program----------");
				System.out.println("1.InsertElements");
				System.out.println("2.SearchElement");
				System.out.println("3.Display");
				System.out.println("0.Exit");
				System.out.println("Enter your Choice:");
				switch (sc.nextInt()) {
				case 1:
					insertTheArray(array, sc);
					System.out.println("Elements inserted Succesfully");
					break;
				case 2:
					System.out.println("Enter the element to search");
					int index = bSearch(array, sc.nextInt(), sc);
					if (index == -1) {
						System.out.println("Element not found");
					} else {
						System.out.println("Element found at index " + index);
					}
					break;
				case 3:
					display(array);
					break;
				case 0:
					System.out.println("Exiting............");
					System.exit(0);
				}
			} while (true);

		}

	}

}
