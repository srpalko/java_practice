package chapter5_loops;

/**
 * Displays the ASCII character table from ! to ~.
 */
public class DisplayASCIITable
{
    public static void main(String[] args)
    {
        int count = 0;
        for (char c = '!'; c <= '~'; c++)
        {
            System.out.print(c + " ");
            count++;
            if (count % 10 == 0)
            {
                System.out.println();
            }
        }
    }
}
