package chapter5_loops;

/**
 * Display a table of miles 1, 2, ..., 9, 10 to kilometers
 */
public class MilesToKilometers
{
    public static void main(String[] args)
    {
        final double MILES_TO_KILOMETERS = 1.60934;

        System.out.println("Miles     Kilometers");

        for (int miles = 1; miles <= 10; miles++)
        {
            double km = miles * MILES_TO_KILOMETERS;
            System.out.printf("%-5d     %.3f\n", miles, km);
        }
    }
}
