/*
13. Exam Eligibility with Medical Cause
Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and
medical cause (Y/N) as input and decide if the student can sit in exam.
Input:
Classes held: 100
Classes attended: 60
Medical cause (Y/N): Y
Output:
Student is allowed to sit for the exam.
*/

import java.util.Scanner;

class Q13_Eligibility
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Classes held: ");
		int total_classes= sc.nextInt();
		
		System.out.print("Classes attended: ");
		int attended= sc.nextInt();
		
		if(attended>=85)
		{
			System.out.print("Student is allowed to sit for the exam.");
		}
		else
		{
			System.out.print("Medical cause (Y/N): ");
			char option= sc.next().charAt(0);
			
			if(option == 'Y' || option == 'y')
			{
				System.out.print("Student is allowed to sit for the exam.");
			}
			else if(option == 'N' || option == 'n' )
			{
				System.out.print("Student is not allowed to sit for the exam.");
			}
			else
			{
				System.out.print("Entered an invalid input.");
			}

		}
	}
}

/*
OUTPUT:

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>javac Q13_Eligibility.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>java Q13_Eligibility
Classes held: 100
Classes attended: 60
Medical cause (Y/N): y
Student is allowed to sit for the exam.
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>java Q13_Eligibility
Classes held: 100
Classes attended: 68
Medical cause (Y/N): N
Student is not allowed to sit for the exam.

*/