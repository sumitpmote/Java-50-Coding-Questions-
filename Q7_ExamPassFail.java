/*
7. Exam Pass or Fail
Scenario: A student gives an exam. Take marks (0–100) as input and print whether the student has passed
(>=35) or failed.
Input:
Enter marks: 42
Output:
Student has passed
*/

import java.util.Scanner;

class Q7_ExamPassFail
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Marks: ");
		int marks= sc.nextInt();
		
		
		if(marks>100 || marks<0)
		{
			System.out.print("Invalid marks. Please Enter accurate marks.");	
		}
		else if(marks>= 35 && marks<101)
		{
			System.out.print("Student has Passed.");
		}
		else
		{
			System.out.println("Student has Failed.");
		}
	}
}


/*
Invalid marks. Please Enter accurate marks.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q7_ExamPassFail.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q7_ExamPassFail
Enter Marks: 35
Student has Passed.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q7_ExamPassFail
Enter Marks: 42
Student has Passed.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q7_ExamPassFail
Enter Marks: 104
Invalid marks. Please Enter accurate marks.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q7_ExamPassFail
Enter Marks: -56
Invalid marks. Please Enter accurate marks.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q7_ExamPassFail
Enter Marks: 34
Student has Failed.
*/			