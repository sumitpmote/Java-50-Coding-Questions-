/*
31. Greatest of Two Numbers (Ternary)
Scenario: You want to quickly compare two numbers. Take two numbers as input and print the greatest
using a ternary operator.
Input:
Enter first number: 45
Enter second number: 30
Output:
Greatest number: 45
*/

import java.util.Scanner;

class Q31_Greatest_Two
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1= sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2= sc.nextInt();
		
		int result;

		result = (num1 > num2) ? num1 : num2;
		System.out.println("Greatest number: " + result);	}
}


/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q31_Greatest_Two.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q31_Greatest_Two
Enter first number: 123
Enter second number: 205
Greatest number: 205
*/