package chapter6_methods;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        System.out.println("Celsius        Fahrenheit        |        Fahrenheit        Celsius");
        System.out.println("-------------------------------------------------------------------");
        for (int c = 40, f = 120; c >= 31; c--, f -= 10)
        {
            double fahrConversion = celsiusToFahrenheit(c);
            double celsConversion = fahrenheitToCelsius(f);
            System.out.printf("%-7.1f        %10.1f        |        %-10.1f        %7.2f\n", c * 1.0, fahrConversion, f * 1.0, celsConversion);
        }
    }

    /**
     * Converts degrees Celsius to degrees Fahrenheit
     * @param celsius degrees Celsius
     * @return degrees Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius)
    {
        return (9.0 / 5) * celsius + 32;
    }

    /**
     * Converts degrees Fahrenheit to degrees Celsius
     * @param fahrenheit degrees Fahrenheit
     * @return degrees Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
