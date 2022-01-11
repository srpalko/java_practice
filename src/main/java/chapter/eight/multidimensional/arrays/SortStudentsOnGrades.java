package chapter.eight.multidimensional.arrays;

import java.util.Arrays;

/**
 * Rewrite of Listing 8.2 that displays students in increasing order of the number of correct answers.
 */
public class SortStudentsOnGrades
{
    public static void main(String[] args)
    {
        // Students' answers to the questions
        char[][] answers =
                {
                        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
                };

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Array to hold score of each student
        int[] studentScore = new int[answers.length];

        // Grade all answers
        for (int i = 0; i < answers.length; i++)
        {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++)
            {
                if (answers[i][j] == keys[j])
                {
                    correctCount++;
                }
                studentScore[i] = correctCount;
            }
        }

        for (int i = 0; i <= 8; i++)
        {
            for (int j = 0, studentScoreLength = studentScore.length; j < studentScoreLength; j++)
            {
                int score = studentScore[j];
                if (score == i)
                {
                    System.out.println("Student " + j + "'s correct count is " + i);
                }
            }
        }
    }
}
