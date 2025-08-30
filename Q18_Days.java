/*
18. Day of the Week
Scenario: Take day number (1–7) and print the day name.
Input:
Enter day number: 4
Output:
Day is Thursday
*/

import java.util.Scanner;

class Q18_Days
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Day Number: ");
		int num= sc.nextInt();
		
		switch(num)
		{
			case 1:
				System.out.print("Day is Monday");
				break;
			
			case 2:
				System.out.print("Day is Tuesday");
				break;
			
			case 3:
				System.out.print("Day is Wednesday");
				break;
			
			case 4:
				System.out.print("Day is Thursday");
				break;
			
			case 5:
				System.out.print("Day is Friday");
				break;
			
			case 6:
				System.out.print("Day is Saturday");
				break;
			
			case 7:
				System.out.print("Day is Sunday");
				break;
			
			default:
				System.out.print("Invalid Day Number.");
			
		}
	}
}

/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q18_Days.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q18_Days
Enter Day Number: 6
Day is Saturday
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q18_Days
Enter Day Number: 4
Day is Thursday
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q18_Days
Enter Day Number: 10
Invalid Day Number.
*/