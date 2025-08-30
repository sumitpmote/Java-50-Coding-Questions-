/*
37. Leap Year Check (Ternary)
Scenario: Take a year as input and check if it is a leap year using ternary operator.
Input:
Enter year: 2024
Output:
Leap Year
*/

import java.util.Scanner;

class Q37_Leap_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year= sc.nextInt();
		
		String res= (year%400 == 0 || year%4==0) ? "Leap Year" : "Not a Leap Year";
		
		System.out.print(res);

	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q37_Leap_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q37_Leap_Ternary
Enter year: 2021
Not a Leap Year
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q37_Leap_Ternary
Enter year: 2024
Leap Year
*/