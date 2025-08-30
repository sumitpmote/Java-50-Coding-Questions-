/*
23. Basic Calculator Using Switch-Case
Scenario: Create a calculator that uses switch-case for operators (+, -, *, /) and prints result.
Input:
Enter first number: 15
Enter second number: 3
Enter operator: /
Output:
Result: 5
*/

import java.util.Scanner;

class Q23_Calculator_Switch_case
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first Number: ");
		int num1= sc.nextInt();
		
		System.out.print("Enter second Number: ");
		int num2= sc.nextInt();
		
		System.out.print("Enter Operator: ");
		char operator= sc.next().charAt(0);
		
		int result=0;
		switch(operator)
		{
			case '+':
				result= num1+num2;
				System.out.print("Result: "+result);
				break;
				
			case '-':
				result= num1-num2;
				System.out.print("Result: "+result);
				break;
				
			case '*':
				result= num1*num2;
				System.out.print("Result: "+result);
				break;
				
			case '/':
				if(num2 !=0)
				{
					result= num1/num2;
					System.out.print("Result: "+result);
				}
				else
				{
					System.out.print("Division by zero is not allowed.");
				}
				break;
			default:
				System.out.print("Invalid Operator.");
		}
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q23_Calculator_Switch_case.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q23_Calculator_Switch_case
Enter first Number: 15
Enter second Number: 3
Enter Operator: /
Result: 5
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q23_Calculator_Switch_case
Enter first Number: 30
Enter second Number: 16
Enter Operator: *
Result: 480
*/