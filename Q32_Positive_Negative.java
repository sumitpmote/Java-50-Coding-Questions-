/*
32. Positive, Negative, or Zero (Ternary)
Scenario: Take a number and determine if it is positive, negative, or zero using ternary operator.
Input:
Enter a number: -12
Output:
Number is Negative
*/

import java.util.Scanner;

class Q32_Positive_Negative
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		
		
		String result= (num>0) ? "Number is Positive" : (num<0) ? "Number is Negative" : "Number is Zero";
		
		System.out.print(result);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q32_Positive_Negative.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q32_Positive_Negative
Enter a number: 0
Number is Zero
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q32_Positive_Negative
Enter a number: 120
Number is Positive
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q32_Positive_Negative
Enter a number: -02
Number is Negative
*/