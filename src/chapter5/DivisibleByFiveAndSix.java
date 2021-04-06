package chapter5;

/**
 * Displays all numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6.
 */
public class DivisibleByFiveAndSix
{
    public static void main(String[] args)
    {
        for (int num = 100, count = 0; num <= 1000; num++)
        {
            if (num % 5 == 0 && num % 6 == 0)
            {
                System.out.print(num + " ");
                count++;
                if (count % 10 == 0)
                {
                    System.out.println();
                }
            }

        }
    }
}
