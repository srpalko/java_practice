package chapter5;

import java.util.Scanner;

/**
 * Converts a decimal integer to binary the hard way.
 */
public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        StringBuilder binary = new StringBuilder();

        while (number > 0)
        {
            binary.append(number % 2);
            number /= 2;
        }
        binary.reverse();
        System.out.println(binary);
    }

    public static String decToBin(int number)
    {
        StringBuilder binary = new StringBuilder();

        while (number > 0)
        {
            binary.append(number % 2);
            number /= 2;
        }
        binary.reverse();
        return binary.toString();
    }
}
