package chapter5_loops;

import java.util.Scanner;

/**
 * Takes a short integer and displays the 16 bits
 * for the integer.
 */
public class BitLevelOperations
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        short num = input.nextShort();
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < 16; i++)
        {
            int test = num & (1 << i);
            if (test != 0)
            {
                binary.append(1);
            } else
            {
                binary.append(0);
            }
        }
        binary.reverse();
        System.out.println("The bits are " + binary);
    }
}
