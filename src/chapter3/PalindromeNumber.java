package chapter3;

import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a three digit number: ");
        int number = input.nextInt();
        if (number % 10 == number / 100)
        {
            System.out.println(number + " is a palindrome");
        }
        else
        {
            System.out.println(number + " is not a palindrome");
        }
    }
}
