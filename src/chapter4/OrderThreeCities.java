package chapter4;

import java.util.Scanner;

/**
 * Takes three cities and displays them in ascending order.
 */
public class OrderThreeCities
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();

        String first = "";
        String second = "";
        String third = "";

        if (firstCity.compareToIgnoreCase(secondCity) < 0 && secondCity.compareToIgnoreCase(thirdCity) < 0)
        {
            first = firstCity;
            second = secondCity;
            third = thirdCity;
        } else if (secondCity.compareToIgnoreCase(firstCity) < 0 && firstCity.compareToIgnoreCase(thirdCity) < 0)
        {
            first = secondCity;
            second = firstCity;
            third = thirdCity;
        } else if (thirdCity.compareToIgnoreCase(firstCity) < 0 && firstCity.compareToIgnoreCase(secondCity) < 0)
        {
            first = thirdCity;
            second = firstCity;
            third = secondCity;
        } else if (firstCity.compareToIgnoreCase(thirdCity) < 0 && thirdCity.compareToIgnoreCase(secondCity) < 0)
        {
            first = firstCity;
            second = thirdCity;
            third = secondCity;
        } else if (thirdCity.compareToIgnoreCase(secondCity) < 0 && secondCity.compareToIgnoreCase(firstCity) < 0)
        {
            first = thirdCity;
            second = secondCity;
            third = firstCity;
        } else if (secondCity.compareToIgnoreCase(thirdCity) < 0 && thirdCity.compareToIgnoreCase(firstCity) < 0)
        {
            first = secondCity;
            second = thirdCity;
            third = firstCity;
        }

        System.out.println("The three cities in alphabetical order are " + first + " " + second + " " + third);
    }
}
