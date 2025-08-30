/*
45. Sort Three Numbers in Ascending Order
Scenario: Take three numbers and print them in ascending order.
Input:
Enter numbers: 45, 12, 78
Output:
Ascending order: 12, 45, 78
*/

import java.util.Scanner;

class Q45_SortNumbers
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int smallest = (num1 < num2 && num1 < num3) ? num1:
					   (num2 < num3 ? num2 : num3);

        int largest = (num1 > num2 && num1 > num3) ? num1:
                      (num2 > num3 ? num2 : num3);

        int middle = num1 + num2 + num3 - smallest - largest;

        System.out.println("Ascending order: " + smallest + ", " + middle + ", " + largest);
	}
}	
					   
/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q45_SortNumbers.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q45_SortNumbers
Enter numbers: 12 32 13
Ascending order: 12, 13, 32
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q45_SortNumbers
Enter numbers: 45 12 78
Ascending order: 12, 45, 78
*/
		