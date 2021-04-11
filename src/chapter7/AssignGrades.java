package chapter7;

import java.util.Scanner;

/**
 * Reads student scores, gets the best score,
 * and then assigns grades based on the following scheme:
 * A if score >= best - 10
 * B if score >= best - 20
 * C if score >= best - 30
 * D if score >= best - 40
 * F otherwise
 */
public class AssignGrades
{
    public static void main(String[] args)
    {
        // read scores from user
        int[] scores = readScores();
        int bestScore = getBestScore(scores);
        char[] students = new char[scores.length];
        assignGrades(bestScore, scores, students);
        displayGrades(students, scores);
    }

    /**
     * Gets the number of students to store scores for,
     * and adds them to an array.
     * @return an array of ints representing student scores.
     */
    public static int[] readScores()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[] scores = new int[numStudents];
        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = input.nextInt();
        }
        return scores;
    }

    /**
     * Finds the highest score in an array.
     * @param scores array of ints
     * @return highest score
     */
    public static int getBestScore(int[] scores)
    {
        int best = scores[0];
        for (int score : scores)
        {
            if (score > best)
            {
                best = score;
            }
        }
        return best;
    }

    public static void assignGrades(int bestScore, int[] scores, char[] students)
    {
        for (int i = 0; i < scores.length; i++)
        {
            char Grade;

            if (scores[i] >= bestScore - 10)
            {
                Grade = 'A';
            } else if (scores[i] >= bestScore - 20)
            {
                Grade = 'B';
            } else if (scores[i] >= bestScore - 30)
            {
                Grade = 'C';
            } else if (scores[i] >= bestScore - 40)
            {
                Grade = 'D';
            } else
            {
                Grade = 'F';
            }
            students[i] = Grade;
        }
    }

    public static void displayGrades(char[] students, int[] scores)
    {
        for (int i = 0; i < students.length; i++)
        {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + students[i]);
        }
    }
} // end class
