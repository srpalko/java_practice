package chapter4;

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
        double latitude1 = Math.toRadians(input.nextDouble() );
        double longitude1 = Math.toRadians(input.nextDouble() );
        System.out.print("Enter point 2 (latitude and longitude) in degrees separated by a space: ");
        double latitude2 = Math.toRadians(input.nextDouble() );
        double longitude2 = Math.toRadians(input.nextDouble() );

        // Calculate result
        final double AVG_EARTH_RADIUS_KM = 6371.01;
        double distance = AVG_EARTH_RADIUS_KM * Math.acos(Math.sin(latitude1) * Math.sin(latitude2)
                + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2) );

        // Display result
        System.out.println("The distance between the two points is " + distance + " km");



    }
}
