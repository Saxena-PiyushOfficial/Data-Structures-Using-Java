package tester;

import java.util.Scanner;
import static recursiveFunction.RecursiveFunctions.*;
public class RecursionTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			do {
				System.out.println("\n-----------Recursion Menu Driven Program---------");
				System.out.println("1.SumOfDigits of a Number");
				System.out.println("2.Square of a Number");
				System.out.println("3.Factorial through tail Recursion");
				System.out.println("4.chech weather a number is Palindrome or not");
				System.out.println("0.Exit");
				System.out.println("Choose option");
				int op = sc.nextInt();
				switch (op) {
				case 1:
					System.out.println("Enter the number to find sum of Digit");
                        System.out.println("The sum of digits is: "+sumOfDigits(sc.nextInt()));
					break;
				case 2:
					System.out.println("Enter the number to square");
                     System.out.println("The square of the number is: "+squareOfNumber(sc.nextInt(),2));
					break;
				case 3:
					System.out.println("Enter the number for Factorial");
					System.out.println("The Factorial ofa number is: "+ factorialOfNumber(sc.nextInt()));
					break;
				case 4:
					System.out.println("Enter the number to check Palindrome or not");
					int x=sc.nextInt();
					int a=isPalindrome(x,0);
                        if(x==a)
                        {
                            System.out.println("It is Palindrome");
                        }
                        else
                        	System.out.println("It is not a Palindrome");
					break;
				case 0:
					System.out.println("Exiting......");
					System.exit(0);
				}
			} while (true);
		}

	}

}
