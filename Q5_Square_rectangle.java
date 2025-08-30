/*
5. Square or Rectangle Garden
Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a
square garden or rectangular.
Input:
Enter length: 12
Enter breadth: 12
Output:
Square garden
*/

import java.util.Scanner;

class Q5_Square_rectangle
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		int length= sc.nextInt();
		
		System.out.print("Enter Breadth: ");
		int breadth= sc.nextInt();
		
		if(length==breadth)
		{
			System.out.println("Square garden.");
		}
		else
		{
			System.out.println("Rectangular garden.");
		}
	}
}

/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q5_Square_rectangle.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q5_Square_rectangle
Enter Length: 12
Enter Breadth: 12
Square garden.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q5_Square_rectangle
Enter Length: 12
Enter Breadth: 16
Rectangular garden.

*/