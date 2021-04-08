package chapter5;

import java.util.Scanner;

/**
 * Takes two strings and displays the largest common prefix of the two strings.
 */
public class LongestCommonPrefix
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();
        int index = 1;
        String sub1;
        String sub2;
        do
        {
            sub1 = string1.substring(0, index);
            sub2 = string2.substring(0, index);
            index++;
        } while (sub1.compareTo(sub2) == 0);

        index-=2;
        if (index <= 0)
        {
            System.out.println(string1 + " and " + string2 + " have no common prefix");
        }
        System.out.println("The common prefix is " + string1.substring(0, index));
    }
}
