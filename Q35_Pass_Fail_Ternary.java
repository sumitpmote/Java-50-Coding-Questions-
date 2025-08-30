/*
35. Pass/Fail Check (Ternary)
Scenario: Take marks as input and print Pass or Fail using ternary operator (Pass if >=35).
Input:
Enter marks: 28
Output:
Fail
*/

import java.util.Scanner;

class Q35_Pass_Fail_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		
		String res= (num>=35) ? "Pass": "Fail";
		
		System.out.print(res);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q35_Pass_Fail_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q35_Pass_Fail_Ternary
Enter a number: 35
Pass
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q35_Pass_Fail_Ternary
Enter a number: 83
Pass
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q35_Pass_Fail_Ternary
Enter a number: 34
Fail
*/