/*
42. Armstrong Numbers Between 100–500
Scenario: Print all Armstrong numbers between 100 and 500. Output:
153
370
371
407
*/

import java.util.Scanner;

class Q42_ArmstrongRange_Ternary
{
	public static void main(String args[])
	{	
		for (int num = 100; num <= 500; num++) 
		{
            int temp = num, sum = 0;

            while (temp > 0) 
			{
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            String result = (sum == num) ? (num + "\n") : "";
            System.out.print(result);
		}
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q42_ArmstrongRange_Ternary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q42_ArmstrongRange_Ternary
153
370
371
407
*/