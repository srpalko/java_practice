package chapter6;

import java.util.Scanner;

public class FormatInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to format: ");
        int number = input.nextInt();
        System.out.print("Enter the formatting width: ");
        int width = input.nextInt();
        String formattedNumber = format(number, width);
        System.out.println(formattedNumber);
    }

    public static String format(int number, int width)
    {
        StringBuilder numberString = new StringBuilder();
        numberString.append(number);
        int numberWidth = numberString.length();
        for (int i = 0; i < width - numberWidth; i++)
        {
            numberString.insert(0, 0);
        }
        return numberString.toString();
    }
}
