package chapter5_loops;

/**
 * Computes tuition and the total cost of four years of tuition (after the tenth year) ten years from now for
 * a university where tuition is $10,000 this year and increases 5% every year.
 */
public class ComputeFutureTuition
{
    public static void main(String[] args)
    {
        double tuition = 10000;
        double increase = 1.05;
        double fourYears = 0;

        for (int year = 1; year <= 10; year++)
        {
            tuition *= increase;
            System.out.printf("Year: %-3d   $%.2f\n", year, tuition);
            if (year >= 7)
            {
                fourYears += tuition;
            }
        }

        System.out.println();
        System.out.printf("The tuition after ten years will be $%.2f\n", tuition);
        System.out.printf("The cost of four years ending after the tenth year is " +
                "$%.2f", fourYears);
    }
}
