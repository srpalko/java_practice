package chapter7_single_dimensional_arrays;

import java.util.Scanner;

/**
 * Simplified version of class from chapter3 using an array of strings
 */
public class ChineseZodiac
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        String[] zodiacNames = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
                "horse", "sheep"};

        int yearCycle = year % 12;

        System.out.println(year + " is a year of the " + zodiacNames[yearCycle]);

    }
}
