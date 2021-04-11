package chapter5_loops;

import java.util.Scanner;

/**
 * Finds the greatest common divisor of two integers.
 */
public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer > 0: ");
        int num1 = input.nextInt();
        System.out.print("Enter integer > 0: ");
        int num2 = input.nextInt();

        // Find the minimum of num1 and num2.
        int d = Math.min(num1, num2);

        // Decrement d until it is the common divisor.
        while (!(num1 % d == 0 && num2 % d == 0))
        {
            d--;
        }

        System.out.println("The greatest common divisor is " + d);
    }
}
