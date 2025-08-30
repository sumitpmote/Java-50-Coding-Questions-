/*
26. Season Based on Month
Scenario: Print season based on month number:
● Dec–Feb → Winter
● Mar–May → Summer
● Jun–Aug → Monsoon
● Sep–Nov → Autumn
*/

import java.util.Scanner;

class Q26_Season_Based_Month
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Month number: ");
		int monNum= sc.nextInt();
		
		switch(monNum)
		{
			case 1:
			case 2:
			case 12:
				System.out.print("Winter");
				break;
			
			case 3:
			case 4:
			case 5:
				System.out.print("Summer");
				break;
			
			case 6:
			case 7:
			case 8:
				System.out.print("Monsoon");
				break;
			
			case 9:
			case 10:
			case 11:
				System.out.print("Autumn");
				break;
			
		}
	}
}


/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q26_Season_Based_Month.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q26_Season_Based_Month
Enter Month number: 6
Monsoon
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q26_Season_Based_Month
Enter Month number: 12
Winter
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q26_Season_Based_Month
Enter Month number: 5
Summer
*/