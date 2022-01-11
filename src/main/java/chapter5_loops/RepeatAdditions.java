package chapter5_loops;

import java.util.Scanner;

/**
 * Revision of an example program that generates subtraction problems
 * Generates ten random addition questions for two integers between 1 and 15.
 * Displays correct count and test time.
 */
public class RepeatAdditions
{
    public static void main(String[] args)
    {
        final int NUMBER_OF_QUESTIONS = 10; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        StringBuilder output = new StringBuilder(" "); // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS)
        {
            // 1. Generate two random numbers between 1 and 15
            int number1 = (int) (1 + Math.random() * 15);
            int number2 = (int) (1 + Math.random() * 15);

            // 2. Prompt the student to answer "What is number1 + number2?"
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            // 3. Grade the answer and display the result
            if (number1 + number2 == answer)
            {
                System.out.println("You are correct!");
                correctCount++;
            } else
            {
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
            }

            // Increase the question count
            count++;

            output.append("\n").append(number1).append(" + ").append(number2).append("=").append(answer).append((number1 + number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output.toString());
    }
}
