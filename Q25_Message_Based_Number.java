/*
25. Message Based on Number (1–5)
Scenario: Take a number (1–5) and print a message according to the case. Useful for simple menu
selection.
Input:
Enter a number: 3
Output:
You selected option 3
*/

import java.util.Scanner;

class Q25_Message_Based_Number
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		
		switch(num)
		{
			case 1:
				System.out.print("You selected option 1");
				break;
			
			case 2:
				System.out.print("You selected option 2");
				break;
			
			case 3:
				System.out.print("You selected option 3");
				break;
			
			case 4:
				System.out.print("You selected option 4");
				break;
			
			case 5:
				System.out.print("You selected option 5");
				break;
				
			default:
				System.out.print("Invalid Input");
				break;
		
		}
	}
}


/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q25_Message_Based_Number.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q25_Message_Based_Number
Enter a number: 5
You selected option 5
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q25_Message_Based_Number
Enter a number: 6
Invalid Input
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q25_Message_Based_Number
Enter a number: 3
You selected option 3
*/