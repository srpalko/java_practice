package chapter6;

import java.util.Scanner;

public class DisplayIntegerReversed
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int entry = input.nextInt();
        reverse(entry);
    }

    /**
     * Displays the reverse of a number
     * @param number number to be displayed in reverse
     */
    public static void reverse(int number)
    {
        while (number > 0)
        {
            System.out.print(number % 10);
            number /= 10;
        }
    }
}
