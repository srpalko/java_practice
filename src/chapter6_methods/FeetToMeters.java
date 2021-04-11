package chapter6_methods;

public class FeetToMeters
{
    public static void main(String[] args)
    {
        // Test program
        System.out.println("Feet        Meters        |        Meters        Feet        ");
        System.out.println("_____________________________________________________________");
        for (int f = 1, m = 20; f <= 10; f++, m += 5)
        {
            double meterConv = footToMeter(f);
            double footConv = meterToFoot(m);
            System.out.printf("%4.1f        %6.3f        |        %-5.1f        %4.3f\n",
                    1.0 * f, meterConv, 1.0 * m, footConv);
        }
    }

    /**
     * Converts feet to meters
     */
    public static double footToMeter(double foot)
    {
        return 0.305 * foot;
    }

    /**
     * Converts meters to feet
     */
    public static double meterToFoot(double meter)
    {
        return 3.279 * meter;
    }
}
