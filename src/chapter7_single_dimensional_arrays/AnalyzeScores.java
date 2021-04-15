package chapter7_single_dimensional_arrays;

import java.util.Scanner;

/**
 * Reads an unspecified number of scores and
 * determines how many scores are above or equal
 * to the average and how many scores are below
 * the average. Enter a negative number to signify
 * the end of the input. Assume that the maximum
 * number of scores is 100.
 */
public class AnalyzeScores
{
    public static void main(String[] args)
    {
        int[] scores = readScores();
        double average = getAverageScore(scores);
        int above = aboveAverage(average, scores);
        int below = belowAverage(average, scores);
        System.out.println("The average score was " + average + ".");
        System.out.println("There were " + above + " scores above the average.");
        System.out.println("There were " + below + " scores below the average.");
    }

    /**
     * Reads integers from the console and stores them
     * in an array. Max 100 numbers.
     * @return an array of ints.
     */
    public static int[] readScores()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter scores (100 max): ");
        int[] scores = new int[100];
        int i = 0;
        while (true)
        {
            int next = input.nextInt();
            if (next < 0)
            {
                break;
            }
            scores[i] = next;
            i++;
        }
        return scores;
    }

    /**
     * Gets the average value from an array of ints
     * @param scores the array to compute
     * @return the average value
     */
    public static double getAverageScore(int[] scores)
    {
        int sum = 0;
        int count = 0;
        for (int score : scores)
        {
            if (score > 0)
            {
                sum += score;
                count++;
            }

        }
        return (1.0 * sum) / count;
    }

    /**
     * Checks array elements against an pre-computed average
     * and counts the number of elements that are above the
     * average.
     * @param average average of elements
     * @param scores array of ints
     * @return number above average
     */
    public static int aboveAverage(double average, int[] scores)
    {
        int count = 0;
        for (int score : scores)
        {
            if (score > average)
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Same as aboveAverage but checks for values
     * below the average.
     * @param average average of array values
     * @param scores an array of ints
     * @return count of values below the average
     */
    public static int belowAverage(double average, int[] scores)
    {
        int count = 0;
        for (int score : scores)
        {
            if (score < average && score > 0)
            {
                count++;
            }
        }
        return count;
    }
}
