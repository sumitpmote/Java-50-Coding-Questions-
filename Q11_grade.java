/*

11. Grade Based on Percentage
Scenario: Your friend got exam marks. Take percentage marks as input and print the grade:
● 90+ → A+
● 76–89 → A
● 66–75 → B+
● 51–65 → B
● 36–50 → C
● Below 35 → Fail

*/

import java.util.Scanner;

class Q11_grade
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Percentage marks: ");
		int marks= sc.nextInt();
		
		if(marks>100 || marks<0)
		{
			System.out.print("Enter correct marks.");
		}
		else if(marks>=90)
		{
			System.out.print("Your grade is A+");
		}
		else if(marks>75 && marks<89)
		{
			System.out.print("Your grade is A");
		}
		else if(marks>65 && marks<76)
		{
			System.out.print("Your grade is B+");
		}			
		else if(marks>=51 && marks<=65)
		{
			System.out.print("Your grade is B");

		}
		else if(marks>=36 && marks<=50)
		{
			System.out.print("Your grade is C");
		}
		else
		{
			System.out.print("Fail");
		}	
	}
}

/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q11_grade.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q11_grade
Enter Percentage marks: 92
Your grade is A+
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q11_grade
Enter Percentage marks: 75
Your grade is B+
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q11_grade
Enter Percentage marks: 59
Your grade is B
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q11_grade
Enter Percentage marks: 35
Fail

*/