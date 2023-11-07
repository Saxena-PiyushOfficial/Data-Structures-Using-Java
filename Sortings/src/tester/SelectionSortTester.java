package tester;

import static bubblesort.BubbleSort.arr;

import java.util.Scanner;

import bubblesort.BubbleSort;


public class SelectionSortTester {
	 public static void main(String[] args)
     {

		 try (Scanner sc = new Scanner(System.in)) {
				BubbleSort ss = new BubbleSort();
				System.out.println("Enter the size of array");
				arr = new int[sc.nextInt()];
				do {
					System.out.println("\n-----------------Selection Sort Program---------------------------");
					System.out.println("1.InsertElements");
					System.out.println("2.Display");
					System.out.println("3.Selection Sorting");
					System.out.println("0.Exit");
					System.out.println("Enter your Choice:");
					switch (sc.nextInt()) {
					case 1:
						ss.insertElements(arr, sc);
						System.out.println("Elements inserted Succesfully");
						break;
					case 2:
						ss.display(arr);
						break;
					case 3:
						ss.Bsort(arr);
						System.out.println("Selection Sort applied");
						break;
					case 0:
						System.out.println("Exiting............");
						System.exit(0);
					}
				} while (true);

			}
     }
}
