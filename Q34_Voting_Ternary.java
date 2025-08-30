/*
34. Voting Eligibility (Ternary)
Scenario: Ask user age and print “Eligible” or “Not Eligible” to vote using ternary operator.
Input:
Enter age: 20
Output:
Eligible to vote
*/

import java.util.Scanner;

class Q34_Voting_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		
		String res= (num>18) ? "Eligible to vote" : "Not Eligible to vote";
		
				System.out.print(res);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q34_Voting_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q34_Voting_Ternary
Enter a number: 19
Eligible to vote
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q34_Voting_Ternary
Enter a number: 18
Not Eligible to vote
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q34_Voting_Ternary
Enter a number: 15
Not Eligible to vote
*/