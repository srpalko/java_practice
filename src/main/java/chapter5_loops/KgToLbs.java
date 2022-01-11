package chapter5_loops;

/**
 * Displays a table showing conversion from kg to lbs for 1, 3, 5, ... 197, 199kg.
 */
public class KgToLbs
{
    public static void main(String[] args)
    {
        final double KG_TO_LBS = 2.205;
        System.out.println("Kilograms     Pounds");
        double lbs;

        for (int i = 1; i < 200; i+=2)
        {
            lbs = i * KG_TO_LBS;
            System.out.printf("%-9d     %6.1f\n", i, lbs);
        }
    }
}
