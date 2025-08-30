/*
46. Character Type Checker
Scenario: Take a character as input and print whether it is an alphabet, digit, or special character.
Input:
Enter character: %
Output:
Special Character
*/

import java.util.Scanner;

class Q46_CharacterTypeChecker 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        String result = (Character.isLetter(ch)) ? "Alphabet"
                       : (Character.isDigit(ch)) ? "Digit"
                       : "Special Character";

        System.out.println(result);
    }
}

