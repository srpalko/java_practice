package chapter5_loops;

/**
 * Displays two tables side by side.
 * One for miles to kilometers and one for kilometers to miles
 */
public class MiToKmToMi
{
    public static void main(String[] args)
    {
        final double MI_TO_KM = 1.60934;
        final double KM_TO_MI = .621371;

        System.out.println("Miles    Kilometers  |  Kilometers    Miles");
        double miToKm, kmToMi;
        for (int miles = 1, km = 20; miles <= 10; miles++, km += 5)
        {
            miToKm = miles * MI_TO_KM;
            kmToMi = km * KM_TO_MI;
            System.out.printf("%-5d    %-10.3f  |  %-10d    %-5.3f\n", miles, miToKm, km, kmToMi);
        }
    }
}
