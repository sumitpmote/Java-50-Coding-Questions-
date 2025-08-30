/*
48. Grade with Plus/Minus
Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−).
Input:
Enter marks: 78
Output:
Grade: A−
*/

import java.util.Scanner;

class Q48_GradeWithSymbol
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter marks: ");
		int num= sc.nextInt();
		
		
		String grade= (num>90 && num<=100)? "A+":
					  (num>80 && num<=90)? "A":
					  (num>70 && num<=80)? "B+":
					  (num>60 && num<=70)? "B":
					  (num>50 && num<=60)? "C+":
					  (num>40 && num<=50)? "C":
					  (num>34 && num<=40)? "D":
					  (num<35 && num>=0)? "Fail": "Enter valid Marks";
					  
		System.out.print(grade);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q48_GradeWithSymbol.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q48_GradeWithSymbol
Enter marks: 102
Enter valid Marks
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q48_GradeWithSymbol
Enter marks: -65
Enter valid Marks
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q48_GradeWithSymbol
Enter marks: 86
A
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q48_GradeWithSymbol
Enter marks: 98
A+
*/