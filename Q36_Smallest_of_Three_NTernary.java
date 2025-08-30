/*
36. Smallest of Three Numbers (Nested Ternary)
Scenario: Take three numbers as input and print the smallest using nested ternary operator.
Input:
Enter numbers: 12, 8, 19
Output:
Smallest number: 8
*/

import java.util.Scanner;

class Q36_Smallest_of_Three_NTernary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		
		String res= (num1< num2 && num1<num3) ? "Smallest number: "+num1 :
					(num2< num1 && num2<num3) ? "Smallest number: "+num2 :
					"Smallest number: "+num3;
		
		System.out.print(res);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q36_Smallest_of_Three_NTernary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q36_Smallest_of_Three_NTernary
Enter numbers: 10 12 18
Smallest number: 10
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q36_Smallest_of_Three_NTernary
Enter numbers: -5 12 -3
Smallest number: -5
*/
		
		
		