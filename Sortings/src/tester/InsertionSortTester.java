package tester;

import static bubblesort.BubbleSort.arr;

import java.util.Scanner;

import insertionsort.InsertionSort;

public class InsertionSortTester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			InsertionSort is = new InsertionSort();
			System.out.println("Enter the size of array");
			arr = new int[sc.nextInt()];
			do {
				System.out.println("\n-----------------Insertion Sort Program---------------------------");
				System.out.println("1.InsertElements");
				System.out.println("2.Display");
				System.out.println("3.Insertion Sorting");
				System.out.println("0.Exit");
				System.out.println("Enter your Choice:");
				switch (sc.nextInt()) {
				case 1:
					is.insertElements(arr, sc);
					System.out.println("Elements inserted Succesfully");
					break;
				case 2:
					is.display(arr);
					break;
				case 3:
					is.Isort(arr);
					System.out.println("Insertion Sort applied");
					break;
				case 0:
					System.out.println("Exiting............");
					System.exit(0);
				}
			} while (true);

		}
	}
}
