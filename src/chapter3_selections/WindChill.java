package chapter3_selections;

import java.util.Scanner;

public class WindChill
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();
        System.out.print("Enter the temperature in Fahrenheit between -58\u00B0F and 41\u00B0F: ");
        double temperature = input.nextDouble();
        boolean legalTemp = temperature >= -58 && temperature <= 41;
        boolean legalSpeed = speed >= 2;
        if (legalTemp && legalSpeed)
        {
            double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
                                + 0.4275 * temperature * Math.pow(speed, 0.16);
            System.out.printf("The wind chill index is %.5f", windChill);
        } else if (!legalSpeed && !legalTemp)
        {
            System.out.println("Invalid wind speed and temperature");
            System.out.println("Wind speed must be >= 2");
            System.out.println("Temperature must be in range: -58\u00B0F - 41\u00B0F");
        } else if (!legalSpeed)
        {
            System.out.println("Invalid speed. Must be >= 2");
        } else if (!legalTemp)
        {
            System.out.println("Invalid temperature. Range: -58\u00B0F - 41\u00B0F");
        }
    }
}
