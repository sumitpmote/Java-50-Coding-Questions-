/*
40. Discount on Purchase (Ternary)
Scenario: A shop gives 10% discount if purchase amount > 1000. Take purchase amount and print total
cost using ternary.
Input:
Enter purchase amount: 1200
Output:
Total cost after discount: 1080
*/

import java.util.Scanner;

class Q40_Discount_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Purchase amount: ");
		int amount= sc.nextInt();
		
		String discount= (amount>1000)? "Total cost after discount: "+(amount-((10*amount)/100)): "No Discount";
		
		System.out.print(discount);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q40_Discount_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q40_Discount_Ternary
Enter Purchase amount: 1200
Total cost after discount: 1080
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q40_Discount_Ternary
Enter Purchase amount: 1350
Total cost after discount: 1215
*/