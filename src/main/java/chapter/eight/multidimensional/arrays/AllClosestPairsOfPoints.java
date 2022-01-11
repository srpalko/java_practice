package chapter.eight.multidimensional.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Revision of Listing 8.3 that displays all closest pairs of points with the same minimum distance.
 */
public class AllClosestPairsOfPoints
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++)
        {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
        double[][] distances = new double[numberOfPoints * numberOfPoints][3];
        int next = 0;
        for (int i = 0; i < points.length; i++)
        {
            for (int j = i + 1; j < points.length; j++)
            {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                distances[next][0] = i;
                distances[next][1] = j;
                distances[next][2] = distance;
                next++;

                if (shortestDistance > distance)
                {
                    shortestDistance = distance;
                }
            }
        }
        for (double[] distance : distances)
        {
            if (distance[2] == shortestDistance)
            {
                int point1Index = (int) distance[0];
                int point2Index = (int) distance[1];

                System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n", points[point1Index][0],
                                  points[point1Index][1], points[point2Index][0], points[point2Index][1]);
            }
        }
        System.out.println("Their distance is " + shortestDistance);


    }

    public static double distance(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
