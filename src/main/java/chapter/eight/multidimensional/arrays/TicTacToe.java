package chapter.eight.multidimensional.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe
{
    public static void main(String[] args)
    {
        char[][] board = new char[3][3];
        Arrays.fill(board[0], ' ');
        Arrays.fill(board[1], ' ');
        Arrays.fill(board[2], ' ');
        displayBoard(board);
        Scanner input = new Scanner(System.in);

        while (true)
        {
            doMove(board, input, 1);
            displayBoard(board);
            int won = gameWon(board);
            if (won == 1)
            {
                System.out.println("X player won");
                break;
            }
            doMove(board, input, 2);
            displayBoard(board);
            won = gameWon(board);
            if (won == 2)
            {
                System.out.println("O player won");
                break;
            }
        }
    }

    private static void doMove(char[][] board, Scanner input, int player)
    {
        char letter = player == 1 ? 'X' : 'O';
        while (true)
        {
            System.out.print("Enter a row (0, 1, or 2) for player " + letter + ": ");
            int row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + letter + ": ");
            int column = input.nextInt();
            if (row < 0 || row > 2 || column < 0 || column > 2)
            {
                System.out.println("That is not a legal entry");
            }
            else if (board[row][column] == ' ')
            {
                board[row][column] = letter;
                break;
            }
            else
            {
                System.out.println("That space is already taken.");
            }
        }
    }

    public static void displayBoard(char[][] board)
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println("-------------");
            String row = "| " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " |";
            System.out.println(row);
        }
        System.out.println("-------------");
    }

    public static int gameWon(char[][] board)
    {
        for (char[] row :
                board)
        {
            int possibleWin = checkRow(row);
            if (possibleWin > 0)
            {
                return possibleWin;
            }
        }

        for (int i = 0; i < board.length; i++)
        {
            int possibleWin = checkRow(new char[]{board[0][i], board[1][i], board[2][i]});
            if (possibleWin > 0)
            {
                return possibleWin;
            }
        }

        int possibleWin = checkRow(new char[]{board[0][0], board[1][1], board[2][2]});
        if (possibleWin > 0)
        {
            return possibleWin;
        }

        possibleWin = checkRow(new char[]{board[0][2], board[1][1], board[2][0]});
        return Math.max(possibleWin, 0);

    }

    public static int checkRow(char[] row)
    {
        int xCount = 0;
        int yCount = 0;
        for (char space :
                row)
        {
            if (space == 'X')
            {
                xCount++;
            }
            else if (space == 'O')
            {
                yCount++;
            }
        }
        if (xCount == 3)
        {
            return 1;
        }
        else if (yCount == 3)
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }
}
