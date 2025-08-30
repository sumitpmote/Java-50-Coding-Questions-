/*
4. Even or Odd Locker Number
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is
even or odd.
Input:
Enter locker number: 17
Output:
Odd locker number
*/

import java.util.Scanner;

class Q4_EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter locker Number: ");
		int num= sc.nextInt();
		
		if(num%2==0)
		{
			System.out.print("Even locker Number.");
		}
		else
		{
			System.out.print("Odd locker Number.");
		}
	}
}

/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q4_EvenOdd.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q4_EvenOdd
Enter locker Number: 12
Even locker Number.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q4_EvenOdd
Enter locker Number: 17
Odd locker Number.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>

*/
