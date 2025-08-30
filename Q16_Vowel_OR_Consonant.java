/*
16. Vowel or Consonant Checker
Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid
input.
Input:
Enter a character: e
Output:
Vowel

*/
import java.util.Scanner;

class Q16_Vowel_OR_Consonant
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String input= sc.next();
		
		if(input.length()!=1)
		{
			System.out.print("You did not enter a character.");
		}
		else
		{
			char ch= input.charAt(0);
			ch = Character.toLowerCase(ch);
			if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u')
			{
			System.out.print("Vowel");			
			}
			else
			{
				System.out.print("Consonant");
			}
		}
	}
}

/*
OUTPUT:

PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q16_Vowel_OR_Consonant.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q16_Vowel_OR_Consonant
Enter a character: sumit
You did not enter a character.
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q16_Vowel_OR_Consonant
Enter a character: e
Vowel
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q16_Vowel_OR_Consonant
Enter a character: S
Consonant

*/