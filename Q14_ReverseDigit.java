/*
14. Reverse a 4-Digit Number
Scenario: Take a 4-digit number and print its reverse.
Input:
Enter 4-digit number: 1234
Output:
Reversed number: 4321
*/

import java.util.Scanner;

class Q14_ReverseDigit
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.print("Enter 4-digit Number: ");
		int number= sc.nextInt();
		
		int reversed=0;
		
		while(number!=0)
		{
			int digit= number % 10;
			reversed= reversed* 10 + digit;
			number= number/10;
		}
		
		System.out.print("Reversed number: "+reversed);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q14_ReverseDigit.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q14_ReverseDigit
Enter 4-digit Number: 1234
Reversed number: 4321
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q14_ReverseDigit
Enter 4-digit Number: 467852
Reversed number: 258764
*/

	
	