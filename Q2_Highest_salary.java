
/*
2. Highest Salary Among Three Offers
Scenario: You have three job offers. Take the offered salaries as input and print which company is
offering the highest salary.
Input:
Enter salary for Company 1: 45000
Enter salary for Company 2: 52000
Enter salary for Company 3: 50000
Output:
Company 2 offers the highest Salary.
*/

import java.util.Scanner;

class Q2_Highest_salary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Salary of Company 1: ");
		int sal1= sc.nextInt();
		System. out.print("Enter Salary of Company 2: ");
		int sal2= sc.nextInt();
		System.out.print("Enter Salary of Company 3: ");
		int sal3= sc.nextInt();
		
		if (sal1 > sal2 && sal1 > sal3)
		{
			System.out.println("Company 1 offers the Highest Salary.");
		}
		else if(sal2 > sal1 && sal2 > sal3)
		{
			System.out.println("Company 2 offers the Highest Salary.");
		}
		else
		{
			System.out.println("Company 3 offers the Highest Salary.");
		}
	}
}


/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q2_Highest_salary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q2_Highest_salary
Enter Salary of Company 1: 42000
Enter Salary of Company 2: 52000
Enter Salary of Company 3: 50000
Company 2 offers the Highest Salary.

*/