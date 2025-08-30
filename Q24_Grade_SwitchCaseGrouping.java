/*
24. Grade Using Switch (Ranges)
Scenario: Take marks (0–100) and print grade using switch-case grouping:
● 0–24 → F
● 25–44 → E
● 45–54 → D
● 55–69 → C
● 70–84 → B
● 85–100 → A
Input:
Enter marks: 24
Output:
Grade: F
*/

import java.util.Scanner;

public class Q24_Grade_SwitchCaseGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
            return;
        }

        switch (marks / 10) {
            case 10: 
            case 9:  
            case 8:  
                System.out.println("Grade: A");
                break;
            case 7:  
                System.out.println("Grade: B");
                break;
            case 6:  
			if (marks >= 55)  
                    System.out.println("Grade: C");
                else               
                    System.out.println("Grade: D");
                break;
            case 5:  
			if (marks >= 55)
                    System.out.println("Grade: C");
                else
                    System.out.println("Grade: D");
                break;
            case 4:  
			if (marks >= 45)
                    System.out.println("Grade: D");
                else
                    System.out.println("Grade: E");
                break;
            case 3:  
            case 2:  
                if (marks >= 25)
                    System.out.println("Grade: E");
                else
                    System.out.println("Grade: F");
                break;
            case 1:  
            case 0:  
                System.out.println("Grade: F");
                break;
        }
    }
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> javac Q24_Grade_SwitchCaseGrouping.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q24_Grade_SwitchCaseGrouping
Enter marks: 24
Grade: F
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 1> java Q24_Grade_SwitchCaseGrouping
Enter marks: 25
Grade: E
*/