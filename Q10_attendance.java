/*
10. Exam Attendance Eligibility
Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as
input, print allowance.
Input:
Enter total classes held: 100
Enter classes attended: 78
Output:
Student is allowed to sit for the exam.
*/


import java.util.Scanner;

class Q10_attendance
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter total Classes held: ");
		int held= sc.nextInt();
		
		System.out.print("Enter classes attended: ");
		int attended= sc.nextInt();
		
		int percent= (attended/held) * 100;
		
		if(percent>= 75)
		{
			System.out.print("Student is allowed to sit for the exam.");
		}
		else
		{
			System.out.print("Student is not allowed to sit for the exam.");

		}
	}
}


/*
OUTPUT:

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>javac Q10_attendance.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>java Q10_attendance
Enter total Classes held: 100
Enter classes attended: 78
Student is not allowed to sit for the exam.
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>java Q10_attendance
Enter total Classes held: 100
Enter classes attended: 73
Student is not allowed to sit for the exam.
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1>java Q10_attendance
Enter total Classes held: 200
Enter classes attended: 130
Student is not allowed to sit for the exam.

*/