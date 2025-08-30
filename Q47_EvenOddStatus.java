/*
47. Even/Odd Status of Two Numbers
Scenario: Take two numbers and print if both are even, both odd, or mixed.
Input:
Enter first number: 12
Enter second number: 17
Output:
Numbers are mixed (one even, one odd)
*/

import java.util.Scanner;

class Q47_EvenOddStatus
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1= sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2= sc.nextInt();
		
		if(num1%2==0 && num2%2==0)
		{
			System.out.print("Both are Even");
		}
		else if(num1%2!=0 && num2%2!=0)
		{
			System.out.print("Both are Odd");
		}
		else if(num1%2==0 && num2%2!=0)
		{
			System.out.print("Numbers are mixed (one even, one odd)");
		}
		else
		{
			System.out.print("Numbers are mixed (one odd, one even)");

		}
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q47_EvenOddStatus.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q47_EvenOddStatus
Enter first number: 13
Enter second number: 10
Numbers are mixed (one odd, one even)
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q47_EvenOddStatus
Enter first number: 12
Enter second number: 17
Numbers are mixed (one even, one odd)
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q47_EvenOddStatus
Enter first number: 110
Enter second number: 10
Both are Even
*/