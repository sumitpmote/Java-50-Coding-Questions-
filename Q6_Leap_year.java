/*
6. Leap Year Check for a Birthday
Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input
and check if it’s a leap year.
Input:
Enter year: 2024
Output:
2024 is not a leap year.
*/

import java.util.Scanner;

class _Leap_year
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year= sc.nextInt();
		
		if(year%400==0 || year%4==0)
		{
			System.out.println(year+" is a leap year.");
		}
		else
		{
			System.out.println(year+" is not a leap year.");
		}
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q6_Leap_year.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q6_Leap_year
Enter year: 2024
2024 is a leap year.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q6_Leap_year
Enter year: 2025
2025 is not a leap year.
*/