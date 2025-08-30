/*
44. Reverse 4-Digit Number and Palindrome Check
Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome.
Input:
Enter 4-digit number: 1221
Output:
Reversed number: 1221
Palindrome: Yes
*/

import java.util.Scanner;

class Q44_Palindrome
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        while (temp > 0) 
		{
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed number: " + rev);

        String result = (num == rev) ? "Yes" : "No";
		
        System.out.println("Palindrome: " + result);
    }
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q44_Palindrome.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q44_Palindrome
Enter 4-digit number: 1221
Reversed number: 1221
Palindrome: Yes
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q44_Palindrome
Enter 4-digit number: 12312
Reversed number: 21321
Palindrome: No
*/
