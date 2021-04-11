package chapter1_intro;

public class Exercises
{
    public static void main(String[] args)
    {
        repeatJavaWelcome();
        System.out.println();
        printJava();
        System.out.println();
        printTable();
        System.out.println();
        expression();
        System.out.println();
        summation();
        System.out.println();
        displayPi();
        System.out.println();
        displayAreaPerimeterOfCircle(6.0);
        System.out.println();
        displayAreaPerimeterOfRectangle(4.5, 7.9);
        System.out.println();
        averageSpeed(14, 45, 30);
        System.out.println();
        popProjection();

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("x = " + x + " y = " + y);
    }

    /**
     * Ex. 1.2 display "Welcome to Java" five times.
     */
    private static void repeatJavaWelcome()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Welcome to Java");
        }
    }

    /**
     * Ex. 1.3 display the word Java in characters.
     */
    private static void printJava()
    {
        System.out.println("    J     A     V     V    A   ");
        System.out.println("    J    A A     V   V    A A  ");
        System.out.println("J   J   AAAAA     V V    AAAAA ");
        System.out.println(" J J   A     A     V    A     A");
    }

    /**
     * Ex. 1.4 Print a table.
     */
    private static void printTable()
    {
        System.out.println("number     number^2     number^3");
        String space = "            ";
        for (int i = 1; i < 5; i++)
        {
            System.out.println(i + space + (i * i) + space + (i * i * i));
        }
    }

    /**
     * Ex. 1.5 Display result of expression.
     */
    private static void expression()
    {
        double result = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
        System.out.println("The result is " + result);
    }

    /**
     * Ex. 1.6 Display a summation of a series
     */
    private static void summation()
    {
        int i = 1;
        int sum = 0;
        while (i < 10)
        {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }

    /**
     * Ex. 1.7 Calculate PI
     */
    private static void displayPi()
    {
        double pi = 4 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13) - (1.0/15) + (1.0/17) - (1.0/19));
        System.out.println("pi = " + pi);
    }

    /**
     * 1.8 area and perimeter of a circle
     */
    private static void displayAreaPerimeterOfCircle(double radius)
    {
        System.out.println("The perimeter is " + (2 * radius * Math.PI));
        System.out.println("The area is " + (radius * radius * Math.PI));
    }

    /**
     * 1.9 area and perimeter of a rectangle.
     */
    private static void displayAreaPerimeterOfRectangle(double width, double height)
    {
        System.out.println("The perimeter is " + ( (2 * width) + (2 * height) ) );
        System.out.println("The area is " + (width * height) );
    }

    //    1.10 average speed in miles
    private static void averageSpeed(double km, int minutes, int seconds)
    {
        double miles = km / 1.609;
        int totalSeconds = (minutes * 60) + seconds;
        double hours = totalSeconds / 3600.0;
        double mph = miles/hours;
        System.out.printf("The average speed is %.2f mi/h\n", mph);
    }

    //    1.11 Population projection
    private static void popProjection()
    {
        final int CURRENT_POPULATION = 312_032_486;
        final int DAYS_IN_YEAR = 365;
        final int BIRTH_RATE = 7;
        final int DEATH_RATE = 13;
        final int IMMIGRATION_RATE = 45;
        final int SECONDS_IN_YEAR = DAYS_IN_YEAR * 24 * 60 * 60;
        final double BABIES_BORN = SECONDS_IN_YEAR / (double)BIRTH_RATE;
        final double DEAD_PEOPLE = SECONDS_IN_YEAR / (double)DEATH_RATE;
        final double IMMIGRANTS = SECONDS_IN_YEAR / (double)IMMIGRATION_RATE;
        final double ADDED_POP = BABIES_BORN + IMMIGRANTS - DEAD_PEOPLE;
        System.out.println(ADDED_POP);
        int newPopulation = CURRENT_POPULATION;
        for (int i = 1; i < 6; i++)
        {
            newPopulation += ADDED_POP;
            System.out.println("Year " + i + " population: " + newPopulation);
        }

    }

}
