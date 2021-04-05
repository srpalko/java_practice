package chapter4;

import java.util.Scanner;

/**
 * Takes an ASCII code (0 - 127) and displays its character.
 */
public class FindCharOfASCIICode
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        byte code = input.nextByte();
        System.out.println("The character for ASCII code " + code + " is " + (char) code);
    }
}
