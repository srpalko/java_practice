package chapter5_loops;

import java.util.Scanner;

/**
 * Takes a string and displays the string in reverse order.
 */
public class ReverseAString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entry = input.nextLine();

        StringBuilder reverse = new StringBuilder();
        for (int i = entry.length() - 1; i >= 0; i--)
        {
            reverse.append(entry.charAt(i));
        }
        System.out.println(reverse);

    }
}
