package chapter6;

public class ApproxSquareRoot
{
    public static void main(String[] args)
    {
        System.out.println(sqrt(9));
    }

    /**
     * Approximates the square root of a number
     * by using the Babylonian method.
     * @param n number to find the square root of
     * @return the approximate square root
     */
    public static double sqrt(long n)
    {
        double lastGuess = 1.0;
        double nextGuess;

        while (true)
        {
            nextGuess = (lastGuess + n / lastGuess) / 2;
            if (Math.abs(lastGuess - nextGuess) < 0.0001)
            {
                return nextGuess;
            } else
            {
                lastGuess = nextGuess;
            }
        }
    }
}
