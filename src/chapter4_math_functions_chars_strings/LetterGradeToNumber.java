package chapter4_math_functions_chars_strings;

import java.util.Scanner;

/**
 * Enter a letter grade and display a corresponding number
 * 4, 3, 2, 1, or 0 for A, B, C, D, or F
 */
public class LetterGradeToNumber
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char letter = input.nextLine().charAt(0);

        int number= -1; // -1 is an error

        switch (Character.toUpperCase(letter))
        {
            case 'A':
                number = 4;
                break;
            case 'B':
                number = 3;
                break;
            case 'C':
                number = 2;
                break;
            case 'D':
                number = 1;
                break;
            case 'F':
                number = 0;
                break;
            default:
                System.out.println(letter + " is an invalid grade");
                System.exit(1);
        }

        System.out.println("The numeric value of grade " + letter + " is " + number);
    }
}
