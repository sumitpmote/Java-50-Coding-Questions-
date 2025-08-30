/*
17. Divisibility Check
Scenario: Check if a number is divisible by 2, 3, and 5 using nested if-else.
Input:
Enter number: 30
Output:
Divisible by 2
Divisible by 3
Divisible by 5
*/

import java.util.Scanner;

class Q17_Divisibility_Check
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num= sc.nextInt();
				
		if(num % 2 ==0)
		{
			System.out.println("Divisible by 2");
			
			if(num % 3==0)
			{
				System.out.println("Divisible by 3");
				
				if(num % 5==0)
				{
					System.out.print("Divisible by 5");
				}
			}
		}
		else
		{
			System.out.print("The number is not divisible by 2, 3 and 5.");
		}
	}
}

/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q17_Divisibility_Check.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q17_Divisibility_Check
Enter Number: 30
Divisible by 2
Divisible by 3
Divisible by 5
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q17_Divisibility_Check
Enter Number: 23
The number is not divisible by 2, 3 and 5.
*/