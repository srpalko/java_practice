package chapter3_selections;

import java.util.Scanner;

public class BooleanOperators
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int choice = input.nextInt();
        boolean fiveAndSix = choice % 5 == 0 && choice % 6 == 0;
        boolean fiveOrSix = choice % 5 == 0 || choice % 6 == 0;
        boolean fiveXORSix = choice % 5 == 0 ^ choice % 6 == 0;

        System.out.println("Is " + choice + " divisible by 5 and 6? " + fiveAndSix);
        System.out.println("Is " + choice + " divisble by 5 or 6? " + fiveOrSix);
        System.out.println("Is " + choice + " divisible by 5 or 6, but not both? " + fiveXORSix);
    }
}
