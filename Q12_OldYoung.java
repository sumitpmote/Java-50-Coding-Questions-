/*
12. Oldest and Youngest Among Three Friends
Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the
oldest and youngest.
Input:
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Output:
Oldest: Friend 2
Youngest: Friend 3
*/

import java.util.Scanner;

class Q12_OldYoung
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter age of friend 1: ");
		int fr1= sc.nextInt();
		
		System.out.print("Enter age of friend 2: ");
		int fr2= sc.nextInt();
		
		System.out.print("Enter age of friend 3: ");
		int fr3= sc.nextInt();
		
		if(fr1>fr2 && fr1>fr3)
		{
			System.out.println("Oldest: Friend 1");
		}
		else if(fr2>fr1 && fr2>fr3)
		{
			System.out.println("Oldest: Friend 2");			
		}
		else
		{
			System.out.println("Oldest: Friend 3");			
		}
		
		if(fr1<fr2 && fr1<fr3)
		{
			System.out.println("Youngest: Friend 1");
		}
		else if(fr2<fr1 && fr2<fr3)
		{
			System.out.println("Youngest: Friend 2");			
		}
		else
		{
			System.out.println("Youngest: Friend 3");			
		}		
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q12_OldYoung.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q12_OldYoung
Enter age of friend 1: 22
Enter age of friend 2: 25
Enter age of friend 3: 20
Oldest: Friend 2
Youngest: Friend 3
*/