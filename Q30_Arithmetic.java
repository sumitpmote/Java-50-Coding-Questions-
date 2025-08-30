/*
30. Menu-Based Simple Arithmetic Operations
Scenario: Implement a menu-based program that asks user to select operation (Addition, Subtraction,
Multiplication, Division) and prints result.
Input:
Select operation (1-Addition, 2-Subtraction): 1
Enter first number: 20
Enter second number: 30
Output:
Result: 50
*/

import java.util.Scanner;

class Q30_Arithmetic
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Select operation (1-Addition, 2-Subtraction, 3- Multiplication, 4-Division): ");
		int option= sc.nextInt();
		if (option >4 && option <1)
		{
			System.out.print("Invalid Input");
		}
		System.out.print("Enter first number: ");
		int num1= sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2= sc.nextInt();
		
		
		switch(option)
		{
			case 1:
				System.out.print(num1+num2);
				break;
			
			case 2:
				System.out.print(num1-num2);
				break;
			
			case 3:
				System.out.print(num1*num2);
				break;
			
			case 4:
				System.out.print(num1/num2);
				break;
		}
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q30_Arithmetic.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q30_Arithmetic
Select operation (1-Addition, 2-Subtraction, 3- Multiplication, 4-Division): 7
Enter first number: 12
Enter second number: 2
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q30_Arithmetic
Select operation (1-Addition, 2-Subtraction, 3- Multiplication, 4-Division): 2
Enter first number: 32
Enter second number: 12
20
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q30_Arithmetic
Select operation (1-Addition, 2-Subtraction, 3- Multiplication, 4-Division): 1
Enter first number: 10
Enter second number: 25
35
*/