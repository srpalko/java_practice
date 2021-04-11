package chapter5_loops;

/**
 * Displays a table of kilograms to pounds 1 -199 and
 * a table of pounds to kilograms 20 - 515.
 */
public class KgToLbsToKg
{
    public static void main(String[] args)
    {
        final double KG_TO_LBS = 2.20462;
        final double LBS_TO_KG = 0.453592;

        System.out.println("Kilograms    Pounds    |    Pounds    Kilograms");
        double kgToLbs, lbsToKg;
        for (int kg = 1, lbs = 20; kg <= 199; kg += 2, lbs += 5)
        {
            kgToLbs = kg * KG_TO_LBS;
            lbsToKg = lbs * LBS_TO_KG;
            System.out.printf("%-9d    %6.1f    |    %-6d    %9.2f\n", kg, kgToLbs, lbs, lbsToKg);
        }
    }
}
