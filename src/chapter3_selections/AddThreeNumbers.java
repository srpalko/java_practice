package chapter3_selections;

import java.util.Scanner;

public class AddThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Generate 3 random integers 0-9
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int num3 = (int) (Math.random() * 10);
        int solution = num1 + num2 + num3;

        System.out.print("What is the sum of " + num1 + " + " + num2 + " + " + num3 + "?: ");
        double answer = input.nextInt();

        if (solution == answer)
        {
            System.out.println("That's correct!");
        }
        else
        {
            System.out.println("I'm sorry, the answer is " + solution);
        }
    }
}
