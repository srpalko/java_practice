package chapter5;

/**
 * Displays all combinations of picking two numbers
 * from 1 to 7.
 */
public class Combinations
{
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 1; i <= 7; i++)
        {
            for (int j = 1; j <= 7; j++)
            {
                if (i != j)
                {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        System.out.println("The total number of all combinations is " + count);

    }
}
