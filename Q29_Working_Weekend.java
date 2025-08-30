/*
29. Day Type Selection
Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status.
Input:
Enter day type (1–Workday, 2–Weekend): 2
Output:
It’s weekend. No work today.
*/

import java.util.Scanner;

class Q29_Working_Weekend
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter day type (1-Workday, 2-Weekend): ");
		int num= sc.nextInt();
		
		if(num==1)
		{
			System.out.print("It's Workday. You have to work Today.");
		}
		else if(num == 2)
		{
			System.out.print("It's weekend. No work today.");
		}
		else
		{
			System.out.print("Invalid Number.");
		}
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q29_Working_Weekend.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q29_Working_Weekend
Enter day type (1-Workday, 2-Weekend): 1
It's Workday. You have to work Today.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q29_Working_Weekend
Enter day type (1-Workday, 2-Weekend): 2
It's weekend. No work today.
*/