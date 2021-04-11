package chapter5_loops;

public class HeadsOrTails
{
    public static void main(String[] args)
    {
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1_000_000; i++)
        {
            long flip = Math.round(Math.random());
            if (flip == 1)
            {
                heads++;
            } else
            {
                tails++;
            }
        }

        System.out.println("After 1,000,000 flips, there are " + heads + " heads and " + tails + " tails.");
    }
}
