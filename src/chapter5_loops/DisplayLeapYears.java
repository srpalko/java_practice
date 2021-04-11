package chapter5_loops;

/**
 * Displays all leap years, ten per line
 * from 101 to 2100 and the number of
 * leap years in that time period.
 */
public class DisplayLeapYears
{
    public static void main(String[] args)
    {
        final int COLUMNS_PER_ROW = 10;
        int count = 0;
        for (int year = 101; year <= 2100; year++)
        {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            {
                count++;
                if (count % COLUMNS_PER_ROW == 0)
                {
                    System.out.println(year);
                } else
                {
                    System.out.print(year + " ");
                }
            }
        }
        System.out.println("\nThere are a total of " + count + " leap years in this time period.");
    }
}
