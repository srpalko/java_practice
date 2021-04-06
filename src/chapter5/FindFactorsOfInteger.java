package chapter5;

import java.util.Scanner;

/**
 * Reads and integer and displays all of its smallest
 * factors in increasing order.
 */
public class FindFactorsOfInteger
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int test = input.nextInt();

        System.out.print("The smallest factors are: ");
        while (test != 1)
        {
            int d = 2;
            while (test % d != 0)
            {
                d++;
            }
            System.out.print(d + " ");
            test /= d;
        }
    }
}
