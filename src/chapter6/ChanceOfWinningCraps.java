package chapter6;

/**
 * Runs the Craps class 10,000 times to
 * determine number of winning games.
 */
public class ChanceOfWinningCraps
{
    public static void main(String[] args)
    {
        int wins = 0;
        for (int i = 0; i < 10000; i++)
        {
            if (Craps.playCraps())
            {
                wins++;
            }
        }
        System.out.println("After 10,000 games, there were " + wins + " wins.");
        System.out.println("The chances of winning are " + (wins / 100.0) + "%");
    }
}
