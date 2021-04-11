package chapter4_math_functions_chars_strings;

import java.util.Scanner;

/**
 * Great circle distance is the distance between two points on the surface of a sphere.
 * Enter the latitude and longitude of two points on the earth in degrees and
 * the great circle distance will be displayed.
 */
public class GreatCircleDistance
{
    public static void main(String[] args)
    {
        // Get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees separated by a space: ");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees separated by a space: ");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();

        // Calculate result
        double distance = findGreatCircleDistance(latitude1, longitude1, latitude2, longitude2);

        // Display result
        System.out.println("The distance between the two points is " + distance + " km");
    }

    /**
     * Find the great circle distance between two point on the earth.
     *
     * @param x1 Latitude of first point in degrees
     * @param y1 Longitude of first point in degrees
     * @param x2 Latitude of second point in degrees
     * @param y2 Longitude of second point in degrees
     * @return distance between the two points in km
     */
    public static double findGreatCircleDistance(double x1, double y1, double x2, double y2)
    {
        final double AVG_EARTH_RADIUS_KM = 6371.01;
        // Convert to radians
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        return AVG_EARTH_RADIUS_KM * Math.acos(Math.sin(x1) * Math.sin(x2)
                + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }
}
