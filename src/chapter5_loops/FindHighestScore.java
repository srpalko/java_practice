package chapter5_loops;

import java.util.Scanner;

/**
 * Takes a number of students, each student's name and score.
 * Displays the student with the highest and second highest score.
 */
public class FindHighestScore
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();

        String name;
        double score;
        String topName = " ";
        String secondName = " ";
        double topScore = 0;
        double secondScore = 0;

        for (int i = 1; i <= numberOfStudents; i++)
        {
            System.out.print("Student " + i + " name: ");
            name = input.nextLine();
            System.out.print("Student " + i + " score (0.0 - 100.0): ");
            score = input.nextDouble();
            input.nextLine();
            if (score < 0)
            {
                score = 0;
            }
            if (score > topScore)
            {
                secondScore = topScore;
                topScore = score;
                secondName = topName;
                topName = name;
            } else if (score > secondScore)
            {
                secondScore = score;
                secondName = name;
            }
        }
        System.out.println("The student with the highest score is " + topName + " with " + topScore);
        System.out.println("The student with the second highest score is " + secondName + " with " + secondScore);
    }
}
