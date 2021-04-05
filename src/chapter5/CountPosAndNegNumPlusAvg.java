package chapter5;

import java.util.Scanner;

/**
 * Reads an unspecified number of integers.
 * Determines amount of positive and negative numbers.
 * Computes total and average of inputs not counting zeros.
 * 0 indicates end of input.
 */
public class CountPosAndNegNumPlusAvg
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number;
        int sum = 0;
        int count = 0;
        int positives = 0;
        int negatives = 0;

        while (true)
        {
            number = input.nextInt();
            if (number == 0)
            {
                break;
            }
            if (number > 0)
            {
                positives++;
            } else
            {
                negatives++;
            }

            count++;
            sum += number;
        }

        if (sum == 0)
        {
            System.out.println("No numbers are entered except 0");
            System.exit(0);
        }
        double average = (double) sum / count;

        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + sum);
        System.out.printf("The average is %.2f", average);
    }
}
