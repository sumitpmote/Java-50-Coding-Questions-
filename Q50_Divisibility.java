/*
50. Divisibility by 2, 3, 5 with Custom Messages
Scenario: Take a number and check divisibility by 2, 3, and 5, printing custom messages for each.
Input:
Enter number: 30
Output:
Divisible by 2
Divisible by 3
Divisible by 5
*/

import java.util.Scanner;

class Q50_Divisibility 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) 
		{
            System.out.println("Divisible by 2");
        }
        if (num % 3 == 0) 
		{
            System.out.println("Divisible by 3");
        }
        if (num % 5 == 0) 
		{
            System.out.println("Divisible by 5");
        }
    }
}

/*
Output:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q50_Divisibility.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q50_Divisibility
Enter number: 25
Divisible by 5
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q50_Divisibility
Enter number: 15
Divisible by 3
Divisible by 5
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q50_Divisibility
Enter number: 30
Divisible by 2
Divisible by 3
Divisible by 5
*/