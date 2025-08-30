/*
28. Traffic Signal Instruction
Scenario: Take traffic signal color as input (Red, Green, Yellow) and print appropriate instruction.
Input:
Enter traffic light color: Green
Output:
Go
*/

import java.util.Scanner;

class Q28_Traffic_signal
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter traffic light color: ");
		String color= sc.nextLine();
		char colour= color.charAt(0);
		colour= Character.toUpperCase(colour);
		
		
		switch(colour)
		{
			case 'R':
				System.out.print("Stop");
				break;
				
			case 'G':
				System.out.print("Go");
				break;
			
			case 'Y':
				System.out.print("The light is about to turn Red.");
				break;
			
			default:
				System.out.print("Invalid color");
		}
	}	
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q28_Traffic_signal.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q28_Traffic_signal
Enter traffic light color:
red
Stop
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q28_Traffic_signal
Enter traffic light color:
Y
The light is about to turn Red.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q28_Traffic_signal
Enter traffic light color:
GREEN
Go
*/