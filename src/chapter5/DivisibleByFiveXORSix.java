package chapter5;

/**
 * Displays numbers 100 to 200 that are divisible by 5 or 6
 * but not both.
 */
public class DivisibleByFiveXORSix
{
    public static void main(String[] args)
    {
        for (int num = 100, count = 0; num <= 200; num++)
        {
            if (num % 5 == 0 ^ num % 6 == 0)
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
