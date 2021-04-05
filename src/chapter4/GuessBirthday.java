package chapter4;

import java.util.Scanner;

/**
 * Guesses your birthday based on user input. Each set shows a decimal
 * representation of a bit in a 5 bit number in the upper left hand corner.
 * The rest of the numbers in each set represent numbers that would have
 * that bit flipped "on" in their binary representation. By adding up the
 * binary digit in each set that the user sees their birthday in, the
 * correct birthday is found.
 */
public class GuessBirthday
{
    public static void main(String[] args)
    {
        String set1 =
                " 1  3  5  7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";

        String set2 =
                " 2  3  6  7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";

        String set3 =
                " 4  5  6  7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";

        String set4 =
                " 8  9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31\n";

        int day = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to answer questions
        System.out.print("Is your birthday in Set1?\n");
        System.out.print(set1);
        System.out.print("\nEnter 'N' for no and 'Y' for yes: ");
        String answer = input.nextLine().toUpperCase();

        if (answer.charAt(0) == 'Y')
            day += 1;

        // Prompt the user to answer questions
        System.out.print("Is your birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 'N' for no and 'Y' for yes: ");
        answer = input.nextLine().toUpperCase();

        if (answer.charAt(0) == 'Y')
            day += 2;

        // Prompt the user to answer questions
        System.out.print("Is your birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter 'N' for no and 'Y' for yes: ");
        answer = input.nextLine().toUpperCase();

        if (answer.charAt(0) == 'Y')
            day += 4;

        // Prompt the user to answer questions
        System.out.print("Is your birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter 'N' for no and 'Y' for yes: ");
        answer = input.nextLine().toUpperCase();

        if (answer.charAt(0) == 'Y')
            day += 8;

        // Prompt the user to answer questions
        System.out.print("Is your birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter 'N' for no and 'Y' for yes: ");
        answer = input.nextLine().toUpperCase();

        if (answer.charAt(0) == 'Y')
            day += 16;

        System.out.println("Your birthday is " + day + "!");
    }
}
