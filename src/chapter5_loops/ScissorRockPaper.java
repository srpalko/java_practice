package chapter5_loops;

import java.util.Scanner;

/**
 * Rewrite of paper, rock, scissors that keeps track of score
 * and keeps playing until the difference between scores is
 * greater than 2.0
 */
public class ScissorRockPaper
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int computerWins = 0;
        int userWins = 0;

        while (Math.abs(computerWins - userWins) < 3)
        {
            int computerChoice = (int) (Math.random() * 3);
            System.out.print("scissor (0), rock (1), paper (2): ");
            int userChoice = input.nextInt();
            String user = RPSString(userChoice);
            String comp = RPSString(computerChoice);

            if (userChoice == computerChoice + 1 || userChoice == 0 && computerChoice == 2)
            {
                System.out.println("The computer is " + comp +
                        ". You are " + user + ". You won");
                userWins++;
            } else if (computerChoice == userChoice)
            {
                System.out.println("The computer is " + comp +
                        ". You are " + user + " too. It is a draw");
            } else
            {
                System.out.println("The computer is " + comp +
                        ". You are " + user + ". You lost");
                computerWins++;
            }
        }
        System.out.println("Game over");
        System.out.println("Final score - Computer: " + computerWins);
        System.out.println("              User:     " + userWins);
    }

    private static String RPSString(int choice)
    {
        String name = "";
        switch (choice)
        {
            case 0:
                name = "scissor";
                break;
            case 1:
                name = "rock";
                break;
            case 2:
                name = "paper";
        }
        return name;
    }
}
