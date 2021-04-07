package chapter5;

import java.util.Scanner;

/**
 * Converts decimal number to octal the hard way.
 */
public class DecimalToOctal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        StringBuilder octal = new StringBuilder();
        if (number < 8)
        {
            octal.append(number);
        } else
        {
            while (number > 0)
            {
                octal.append(number % 8);
                number /= 8;
            }
        }
        octal.reverse();
        System.out.println(octal);
    }
}
