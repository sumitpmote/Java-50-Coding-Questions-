/*
1. Greatest of Two Test Scores
Scenario: Your friend took two mock tests. Write a program to take the two test scores as input and print
which test the friend scored higher in.
Input:
Enter score for Test 1: 78
Enter score for Test 2: 85
Output:
Test 2 has higher score.
*/

import java.util.Scanner;

class Q1_Greatest
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter score for Test 1: ");
		int a= sc.nextInt();
		System.out.println("Enter score for Test 2: ");
		int b= sc.nextInt();
		
		if(a>b)
		{
			System.out.println("Test 1 has the Highest score is:" +a);
		}
		else
		{
			System.out.println("Test 2 has the highest score is:" +b);
		}
	}
}


/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q1_Greatest.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q1_Greatest
Enter score for Test 1:
78
Enter score for Test 2:
85
Test 2 has the highest score is:85

*/