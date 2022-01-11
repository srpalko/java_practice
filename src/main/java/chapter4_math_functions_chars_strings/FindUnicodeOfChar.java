package chapter4_math_functions_chars_strings;

import java.util.Scanner;

public class FindUnicodeOfChar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String character = input.nextLine();
        int code = character.charAt(0);
        System.out.println("The Unicode for the character " + character.charAt(0) + " is " + code);
    }
}
