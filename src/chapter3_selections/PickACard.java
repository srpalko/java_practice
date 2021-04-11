package chapter3_selections;

import java.util.Scanner;

public class PickACard
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int suit = (int) (Math.random() * 4);
        int rank = (int) (Math.random() * 13) + 1;
        String suitName = "";
        switch (suit)
        {
            case 0:
                suitName = "Clubs";
                break;
            case 1:
                suitName = "Diamonds";
                break;
            case 2:
                suitName = "Hearts";
                break;
            case 3:
                suitName = "Spades";
                break;
        }

        String rankName = "";
        switch (rank)
        {
            case 1:
                rankName = "Ace";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                rankName = String.valueOf(rank);
                break;
            case 11:
                rankName = "Jack";
                break;
            case 12:
                rankName = "Queen";
                break;
            case 13:
                rankName = "King";
        }

        System.out.println("The card you picked is the" + rankName + " of " + suitName);
    }
}
