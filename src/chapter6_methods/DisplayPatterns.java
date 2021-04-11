package chapter6_methods;

public class DisplayPatterns
{
    public static void main(String[] args)
    {
        displayPatterns(25);
    }

    /**
     * Displays a pyramid of integers descending to the left.
     * @param n height and width of the pyramid
     */
    public static void displayPatterns(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = n; j >= 1; j--)
            {
                if (j <= i)
                {
                    System.out.printf("%3d", j);
                } else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
