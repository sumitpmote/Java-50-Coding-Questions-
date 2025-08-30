/*
33. Even or Odd (Ternary)
Scenario: Take a number and check if it is even or odd using ternary operator.
Input:
Enter a number: 17
Output:
Number is Odd
*/

import java.util.Scanner;

class Q33_EvenOdd_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		
		String res= (num%2==0) ? "Number is Even" : "Number is Odd";
		
		System.out.print(res);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q33_EvenOdd_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q33_EvenOdd_Ternary
Enter a number: 8
Number is Even
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q33_EvenOdd_Ternary
Enter a number: 33
Number is Odd
*/