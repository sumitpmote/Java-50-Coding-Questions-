/*
3. Bank Transaction Check
Scenario: You check your bank account and see a transaction amount. Print whether the transaction is a
deposit (positive) or a withdrawal (negative).
Input:
Enter transaction amount: -2500
Output:
Withdrawal transaction.
*/

import java.util.Scanner;

class Q3_Transaction
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter transaction amount: ");
		int amount= sc.nextInt();
		
		if(amount>0)
		{
			System.out.println("Deposit transaction.");
		}
		else
		{
			System.out.println("Withdrawal transaction.");
		}
	}
}

/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q3_Transaction.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q3_Transaction
Enter transaction amount: -2500
Withdrawal transaction.
*/