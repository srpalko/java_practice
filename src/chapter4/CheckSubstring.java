package chapter4;

import java.util.Scanner;

/**
 * Takes two strings and reports whether the second string
 * is a substring of the first.
 */
public class CheckSubstring
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        if (s1.contains(s2))
        {
            System.out.println(s2 + " is a substring of " + s1);
        }
        else
        {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
