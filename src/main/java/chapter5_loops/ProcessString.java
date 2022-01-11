package chapter5_loops;

import java.util.Scanner;

/**
 * Takes a string and displays the characters at
 * odd positions.
 */
public class ProcessString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entry = input.nextLine();

        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < entry.length(); i++)
        {
            if (i % 2 == 0)
            {
                odd.append(entry.charAt(i));
            }
        }
        System.out.println(odd);
    }
}
