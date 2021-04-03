package chapter3;

import java.util.Scanner;

public class RockPaperScissor
{
    public static void main(String[] args)
    {
        int computerChoice = (int) (Math.random() * 3);
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int userChoice = input.nextInt();
        String user = RPSString(userChoice);
        String comp = RPSString(computerChoice);

        if (userChoice == computerChoice + 1 || userChoice == 0 && computerChoice == 2)
        {
            System.out.println("The computer is " + comp +
                    ". You are " + user + ". You won");
        } else if (computerChoice == userChoice)
        {
            System.out.println("The computer is " + comp +
                    ". You are " + user + " too. It is a draw");
        } else
        {
            System.out.println("The computer is " + comp +
                    ". You are " + user + ". You lost");
        }
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
