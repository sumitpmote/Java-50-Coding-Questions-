/*
39. Bonus Eligibility (Ternary)
Scenario: A company gives 5% bonus if years of service > 5. Take salary and years of service, print
bonus eligibility using ternary.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus: 2500
*/

import java.util.Scanner;

class Q39_Bonus_Eligibility_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		int salary= sc.nextInt();
		
		System.out.print("Enter years of service: ");
		int service= sc.nextInt();
		
		String Bonus= (service>5) ? (5*salary)/100+ "" : "No Bonus";
		
		System.out.print(Bonus);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q39_Bonus_Eligibility_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q39_Bonus_Eligibility_Ternary
Enter salary: 5000
Enter years of service: 7
250
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q39_Bonus_Eligibility_Ternary
Enter salary: 45250
Enter years of service:
5
No Bonus
*/