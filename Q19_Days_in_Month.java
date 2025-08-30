/*
19. Days in a Month
Scenario: Take month number (1–12) and print number of days in that month.
Input:
Enter month number: 2
Output:
28 or 29 days
*/

import java.util.Scanner;
class Q19_Days_in_Month
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Month Number: ");
		int num= sc.nextInt();
		
		switch(num)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 12:
				System.out.print("31 days");
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("30 days");
				break;
			
			case 2:
				System.out.print("28 or 29 days");
				break;
				
			default:
				System.out.print("Invalid Month number");
		}
	}
}

/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q19_Days_in_Month.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q19_Days_in_Month
Enter Month Number: 12
31 days
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q19_Days_in_Month
Enter Month Number: 2
28 or 29 days
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q19_Days_in_Month
Enter Month Number: 15
Invalid Month number
*/