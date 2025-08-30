/*
43. Sum of Digits of a Number
Scenario: Take a number as input and print the sum of its digits.
Input:
Enter number: 482
Output:
Sum of digits: 14
*/

import java.util.Scanner;

class Q43_SumOfDigit_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number= sc.nextInt();
		
		int temp= number;
		int sum=0;
		
		while(temp>0)
		{
			sum+= temp%10;
			temp/=10;
		}
		
		System.out.print("Sum of digits: "+sum);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q43_SumOfDigit_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q43_SumOfDigit_Ternary
Enter number: 123
Sum of digits: 6
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q43_SumOfDigit_Ternary
Enter number: 482
Sum of digits: 14
*/