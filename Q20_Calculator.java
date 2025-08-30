/*
20. Basic Calculator Using If-Else
Scenario: Create a calculator that takes two numbers and an operator (+, -, *, /) and prints result using
nested if-else.
Input:
Enter first number: 10
Enter second number: 5
Enter operator: *
*/

import java.util.Scanner;

class Q20_Calculator
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first Number: ");
		int first= sc.nextInt();
		
		System.out.print("Enter second Number: ");
		int second= sc.nextInt();
		
		System.out.print("Enter operator: ");
		char operator= sc.next().charAt(0);
		
		int res=0;
		
		if(operator == '+')
		{
			res= first+second;
			System.out.print("The Addition of "+first+" and "+second+ " is "+ res);
		}
		else
		{
			if(operator == '-')
			{
				res= first-second;
				System.out.print("The Subtraction of "+first+" and "+second+ " is "+ res);
			}
			else
			{
				if(operator == '*')
				{
					res= first*second;
					System.out.print("The Multiplication of "+first+" and "+second+ " is "+ res);
				}
				else
				{
					if(operator == '/')
					{
						if(second !=0)
						{
							res= first/second;
							System.out.print("The Division of "+first+" and "+second+ " is "+ res);
						}
						else
						{
							System.out.print("Division by zero is not allowed.");
						}
					}
					else
					{
						System.out.print("Invalid Operator.");
					}
				}
			}
			
		}

	}
}

/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q20_Calculator.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q20_Calculator
Enter first Number: 20
Enter second Number: 12
Enter operator: +
The Addition of 20 and 12 is 32
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q20_Calculator
Enter first Number: 30
Enter second Number: 56
Enter operator: -
The Subtraction of 30 and 56 is -26
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q20_Calculator
Enter first Number: 32
Enter second Number: 4
Enter operator: /
The Division of 32 and 4 is 8
*/
