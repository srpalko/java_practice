package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

public class IntersectingPoint {
    public static void main(String[] args) {
        // TODO: 8/4/2021 write the main method
        var input = new Scanner(System.in);
        System.out.print("Enter four points: ");
        double[][] pointArray = new double[4][2];
        for (int i = 0; i < pointArray.length; i++) {
            for (int j = 0; j < pointArray[i].length; j++) {
                pointArray[i][j] = input.nextDouble();
            }
        }
        var intersectingPoint = getIntersectingPoint(pointArray);
        assert intersectingPoint != null;
        System.out.println("The intersecting point is " + intersectingPoint[0] + " " + intersectingPoint[1]);
    }

    public static double[] getIntersectingPoint(double[][] points) {
        var a = points[0][1] - points[1][1];
        var b = points[0][0] - points[1][0];
        var c = points[2][1] - points[3][1];
        var d = points[2][0] - points [3][0];
        var e = ((points[0][1] - points[1][1]) * points[0][0]) - ((points[0][0] - points[1][0]) * points[0][1]);
        var f = ((points[2][1] - points[3][1]) * points[2][0]) - ((points[2][0] - points[3][0]) * points[2][1]);
        if ((a * d) - (b * c) == 0) {
            return null;
        }
        var x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        var y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        return new double[]{x, y};
    }
}
