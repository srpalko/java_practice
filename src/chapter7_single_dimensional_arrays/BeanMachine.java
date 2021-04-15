package chapter7_single_dimensional_arrays;

import java.util.Scanner;

/**
 * The bean machine, also known as a quincunx or the Galton box, is a device for statistics experiments named after
 * English scientist Sir Francis Galton. It consists of an upright board with evenly spaced nails (or pegs) in a
 * triangular form.
 * Balls are dropped from the opening of the board. Every time a ball hits a nail, it has a 50% chance of falling to
 * the left or to the right. The piles of balls are accumulated in the slots at the bottom of the board.
 * This is a simulation of the bean machine. It prompts the user to enter the number of balls and the number of the
 * slots in the machine. The falling of each ball is simulated by printing its path. The final buildup of balls in the
 * slots is displayed as a histogram.
 */
public class BeanMachine
{
    public static void main(String[] args)
    {
        // get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numSlots = input.nextInt();

        // Create array to represent the slots
        int[] slots = new int[numSlots];

        int maxBalls = 0;
        for (int i = 0; i < numBalls; i++)
        {
            System.out.print("Ball " + (i + 1) + ": ");
            int slot = dropBall(numSlots);
            slots[slot]++;
            if (slots[slot] > maxBalls)
            {
                maxBalls = slots[slot];
            }
        }

        System.out.println();

        for (int i = maxBalls - 1; i >= 0; i--)
        {
            for (int j = 0; j < numSlots; j++)
            {
                if (slots[j] - 1 >= i)
                {
                    System.out.print("0 ");
                } else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= numSlots; i++)
        {
            System.out.print(i + " ");
        }
    }

    public static int dropBall(int numSlots)
    {
        int pegRowDepth = numSlots - 1;
        int rCount = 0;
        for (int i = 0; i < pegRowDepth; i++)
        {
            int direction = (int) (Math.random() * 2);
            if (direction == 0)
            {
                System.out.print('L');
            } else
            {
                System.out.print('R');
                rCount++;
            }
        }
        System.out.println();
        return rCount;
    }
}
