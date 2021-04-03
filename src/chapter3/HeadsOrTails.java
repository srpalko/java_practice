package chapter3;

import java.util.Scanner;

public class HeadsOrTails
{
    public static void main(String[] args)
    {
        int flip = Math.random() >= 0.5 ? 1 : 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Guess heads or tails (0 or 1): ");
        int choice = input.nextByte();
        if (choice == flip)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Wrong!");
        }
    }
}
