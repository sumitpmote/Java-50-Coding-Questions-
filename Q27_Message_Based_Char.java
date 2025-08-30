/*
27. Print Message Based on Character (A–E)
Scenario: Take a character (A–E) and print a specific message using switch-case.
Input:
Enter a character: B
Output:
You selected option B
*/

import java.util.Scanner;

class Q27_Message_Based_Char
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch= sc.next().charAt(0);
		ch= Character.toUpperCase(ch);
		
		switch(ch)
		{
			case 'A':
				System.out.print("You selected option "+ch);
				break;
				
			case 'B':
				System.out.print("You selected option "+ch);
				break;
			
			case 'C':
				System.out.print("You selected option "+ch);
				break;
				
			case 'D':
				System.out.print("You selected option "+ch);
				break;
				
			case 'E':
				System.out.print("You selected option "+ch);
				break;
				
			
		}
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q27_Message_Based_Char.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q27_Message_Based_Char
Enter a character: c
You selected option C
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q27_Message_Based_Char
Enter a character: e
You selected option E
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q27_Message_Based_Char
Enter a character: A
You selected option A
*/