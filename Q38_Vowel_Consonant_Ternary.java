/*
38. Vowel or Consonant (Ternary)
Scenario: Take a character and check if it is a vowel or consonant using ternary operator.
Input:
Enter character: i
Output:
Vowel
*/

import java.util.Scanner;

class Q38_Vowel_Consonant_Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter character: ");
		char ch= sc.next().charAt(0);
		ch= Character.toLowerCase(ch);
		
		String res= (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonant";
		
		System.out.print(res);
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q38_Vowel_Consonant_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q38_Vowel_Consonant_Ternary
Enter character: k
Consonant
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q38_Vowel_Consonant_Ternary
Enter character: i
Vowel
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q38_Vowel_Consonant_Ternary
Enter character: Sumit
Consonant
*/
		