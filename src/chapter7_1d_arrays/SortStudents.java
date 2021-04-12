package chapter7_1d_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Prompts the user to enter the number of students, the students' names, and their scores,
 * and prints students names in decreasing order of their scores.
 */
public class SortStudents
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++)
        {
            System.out.print("Enter student name and score: ");
            names[i] = input.next();
            scores[i] = input.nextInt();
        }

        // TODO: 4/11/2021 This sort of works. It fails when two students have the same score.
        int[] sortedScores = scores.clone();
        Arrays.sort(sortedScores);

        for (int i = sortedScores.length - 1; i >= 0; i--)
        {
            int score = sortedScores[i];
            int index = ExecutionTime.linearSearch(scores, score);
            System.out.println(names[index] + " " + scores[index]);
        }
    }
}
