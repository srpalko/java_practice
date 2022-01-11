package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

public class RightmostLowestPoint {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter 6 points: ");
        double[][] points = new double[6][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        var rightmostLowestPoint = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + rightmostLowestPoint[0] + ", "
                + rightmostLowestPoint[1] + ").");
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        var rightmost = Double.MIN_VALUE;
        var lowest = Double.MAX_VALUE;
        double[] lowestPoint = new double[2];
        for (var point : points
             ) {
            if (point[0] >= rightmost && point[1] <= lowest) {
                rightmost = point[0];
                lowest = point[1];
                lowestPoint = point;
            }
        }
        return lowestPoint;
    }
}
