package chapter20.SortPointsInPlane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tests the Point class and CompareY class.
 */
public class SortPointsInPlane
{
    public static void main(String[] args)
    {
        // Size of array
        final int ARRAY_SIZE = 100;
        // Create an array of points and an ArrayList of points
        Point[] points = new Point[100];
        List<Point> pointArrayList = new ArrayList<>(100);

        // Fill both with the same random points.
        for (int i = 0; i < ARRAY_SIZE; i++)
        {
            double randX = Math.random() * 20;
            double randY = Math.random() * 20;
            points[i] = new Point(randX, randY);
            pointArrayList.add(new Point(randX, randY));
        }

        // Sort using the Arrays.sort which uses Comparable interface
        // The compareTo method of Point is written to sort by
        // the value of the x coordinate, then by y.
        Arrays.sort(points);
        // Display the Points
        System.out.println("Points sorted by compareTo()");
        for (Point point : points)
        {
            System.out.println(point.toString());
        }

        System.out.println();

        // The arrayList is being sorted by List.sort
        // which takes a Comparator. CompareY implements
        // Comparator and defines the compare method to
        // sort by y coordinate and then by x.

        pointArrayList.sort(new CompareY());

        // Display the Points
        System.out.println("Points sorted by compare()");
        for (Point point :
                pointArrayList)
        {
            System.out.println(point.toString());
        }

    }

}
