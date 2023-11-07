package tester;

import java.util.Scanner;
import static bubblesort.BubbleSort.*;
import bubblesort.BubbleSort;

public class BubbleSortTester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			BubbleSort bs = new BubbleSort();
			System.out.println("Enter the size of array");
			arr = new int[sc.nextInt()];
			do {
				System.out.println("-----------------Bubble Sort Program---------------------------");
				System.out.println("1.InsertElements");
				System.out.println("2.Display");
				System.out.println("3.Bubble Sorting");
				System.out.println("0.Exit");
				System.out.println("Enter your Choice:");
				switch (sc.nextInt()) {
				case 1:
					bs.insertElements(arr, sc);
					System.out.println("Elements inserted Succesfully");
					break;
				case 2:
					bs.display(arr);
					break;
				case 3:
					bs.Bsort(arr);
					System.out.println("Bubble Sort applied");
					break;
				case 0:
					System.out.println("Exiting............");
					System.exit(0);
				}
			} while (true);

		}
	}
}
