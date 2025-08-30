/*
21. Day of the Week (Ternary)
Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators.
Input:
Enter day number: 3
Output:
Day is Wednesday
*/

import java.util.Scanner;

class Q21_Days_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Day Number: ");
		int num= sc.nextInt();
		
		String Day= (num ==1)? "Monday" :
		            (num ==2)? "Tuesday":
					(num == 3)? "Wednesday":
					(num ==4)? "Thursday":
					(num==5)? "Friday":
					(num==6)? "Saturday":
					(num==7)? "Sunday":
					"Invalid Number!";
		
		System.out.print("Day is "+Day);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q21_Days_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q21_Days_Ternary
Enter Day Number: 6
Day is Saturday
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q21_Days_Ternary
Enter Day Number: 3
Day is Wednesday
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q21_Days_Ternary
Enter Day Number: 8
Day is Invalid Number!
*/