/*
8. Shop Discount Calculation
Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount
as input and calculate final cost.
Input:
Enter total purchase amount: 1200
Output:
Final cost after discount: 1080
*/

import java.util.Scanner;

class Q8_Discount
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter total purchase amount: ");
		int amount= sc.nextInt();
		
		if(amount>1000)
		{
			int discount= ( 10 * amount ) / 100;
			int result= (amount - discount);
			System.out.println("Final cost after discount: "+ result);
		}
		else
		{
			System.out.println("You did not get any discount. Purchase amount should be above 1000.");
		}
	}
}

/*
OUTPUT:

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>javac Q8_Discount.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>java Q8_Discount
Enter total purchase amount: 1000
You did not get any discount. Purchase amount should be above 1000.

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>java Q8_Discount
Enter total purchase amount: 1200
Final cost after discount: 1080
*/