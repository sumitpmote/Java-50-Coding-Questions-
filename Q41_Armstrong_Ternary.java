/*
41. Check Armstrong Number (3-Digit)
Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits =
number).
Input:
Enter number: 153
Output:
153 is an armstrong number
*/

import java.util.Scanner;

class Q41_Armstrong_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number= sc.nextInt();
		
		int temp= number;
		int sum=0;
		
		
		while(temp>0)
		{
			int digit= temp%10;
			sum += digit*digit*digit;
			temp /=10;
		}
		
		String res= (sum== number)? number+" is an armstrong number": number+" is not an armstrong number";
		
		System.out.print(res);

	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q41_Armstrong_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q41_Armstrong_Ternary
Enter number: 153
153 is an armstrong number
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q41_Armstrong_Ternary
Enter number: 121
121 is not an armstrong number
*/