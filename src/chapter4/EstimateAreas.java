package chapter4;

import static chapter4.GreatCircleDistance.findGreatCircleDistance;
import static chapter2.TriangleArea.areaOfTriangle;

/**
 * Finds the estimated area enclosed by Atlanta, GA; Orlando, FL; Savannah, GA; and
 * Charlotte, NC.
 */
public class EstimateAreas
{
    public static void main(String[] args)
    {
        // Coordinates of the four cities
        final double ATLANTA_LAT = 33.753746;
        final double ATLANTA_LONG = -84.386330;
        final double ORLANDO_LAT = 28.538336;
        final double ORLANDO_LONG = -81.379234;
        final double SAVANNAH_LAT = 32.076176;
        final double SAVANNAH_LONG = -81.088371;
        final double CHARLOTTE_LAT = 35.227085;
        final double CHARLOTTE_LONG = -80.843124;

        // Find the distance between three cities to form a triangle
        double atlantaToCharlotte = findGreatCircleDistance(ATLANTA_LAT, ATLANTA_LONG,
                CHARLOTTE_LAT, CHARLOTTE_LONG);
        System.out.println(atlantaToCharlotte);
        double charlotteToSavannah = findGreatCircleDistance(CHARLOTTE_LAT, CHARLOTTE_LONG, SAVANNAH_LAT, SAVANNAH_LONG);
        double savannahToAtlanta = findGreatCircleDistance(SAVANNAH_LAT, SAVANNAH_LONG, ATLANTA_LAT, ATLANTA_LONG);

        // Find the area of that triangle
        double area1 = areaOfTriangle(atlantaToCharlotte, charlotteToSavannah, savannahToAtlanta);

        // Find the remaining distances to form the second triangle
        double atlantaToOrlando = findGreatCircleDistance(ATLANTA_LAT, ATLANTA_LONG, ORLANDO_LAT, ORLANDO_LONG);
        double orlandoToSavannah = findGreatCircleDistance(ORLANDO_LAT, ORLANDO_LONG, SAVANNAH_LAT, SAVANNAH_LONG);

        // Find the area of the second triangle
        double area2 = areaOfTriangle(atlantaToOrlando, orlandoToSavannah, savannahToAtlanta);

        // Total area is the sum of area1 and area2
        double totalArea = area1 + area2;

        // Display result
        System.out.println("The estimated area of the space enclosed by Atlanta,GA; Orlando, FL; Savannah, GA; and Charlotte, NC");
        System.out.printf("is %.0f km\u00B2.", totalArea);
    }
}
