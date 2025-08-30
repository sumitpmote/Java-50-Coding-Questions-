/*
15. Lucky Number Check
Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky.
Input:
Enter 4-digit number: 3521
Output:
Not a lucky number
*/

import java.util.Scanner;

class Q15_LuckyNumber
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.print("Enter 4-digit Number: ");
		int number= sc.nextInt();
		
		int one= (number/1000)%10;
		int two= (number/100)%10;
		int three= (number/10)%10;
		int four= number %10;
		
		if (one+two == three+four)
		{
		System.out.print("It is a Lucky number.");			
		}
		else
		{
		System.out.print("Not a Lucky number.");						
		}
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q15_LuckyNumber.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q15_LuckyNumber
Enter 4-digit Number: 3521
Not a Lucky number.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q15_LuckyNumber
Enter 4-digit Number: 2350
It is a Lucky number.
*/