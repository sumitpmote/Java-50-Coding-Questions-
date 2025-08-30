/*
9. Employee Bonus Eligibility
Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and
years of service as input and print bonus amount.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus amount: 2500
*/

import java.util.Scanner;

class Q9_Bonus_Discount
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		int salary= sc.nextInt();
		
		System.out.print("Enter years of Service: ");
		int exp= sc.nextInt();
		
		if (exp>5)
		{
			int bonus= (5 * salary) / 100;
			System.out.print("Bonus amount: "+bonus);
		}
		else
		{
			System.out.print("Sorry!! Bonus applies only if service exceeds 5 years.");
		}
	}
}

/*
OUTPUT:

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>javac Q9_Bonus_Discount.java
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>java Q9_Bonus_Discount
Enter salary: 50000
Enter years of Service: 6
Bonus amount: 2500
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>java Q9_Bonus_Discount
Enter salary: 35000
Enter years of Service: 4
Sorry!! Bonus applies only if service exceeds 5 years.

*/
