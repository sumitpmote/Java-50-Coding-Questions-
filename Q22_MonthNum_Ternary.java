/*
22. Month Name from Number
Scenario: Take month number (1–12) and print the month name using ternary operators or if-else.
Input:
Enter month number: 8
Output:
Month is August
*/

import java.util.Scanner;

class Q22_MonthNum_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Month Number: ");
		int num= sc.nextInt();
		
		String Month= (num == 1)? "January":
					  (num == 2)? "February":
					  (num == 3)? "March":
					  (num == 4)? "April":
					  (num == 5)? "May":
					  (num == 6)? "June":
					  (num == 7)? "July":
					  (num == 8)? "August":
					  (num == 9)? "September":
					  (num == 10)? "October":
					  (num == 11)? "November":
					  (num == 12)? "December":
					  "Invalid";
		if(Month.equals("Invalid"))
		{
			System.out.print("Invalid Month Number!");
		}
		else
		{
			System.out.print("Month is "+Month);
		}
	}
} 

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q22_MonthNum_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q22_MonthNum_Ternary
Enter Month Number: 14
Invalid Month Number!
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q22_MonthNum_Ternary
Enter Month Number: 12
Month is December
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q22_MonthNum_Ternary
Enter Month Number: 8
Month is August
*/