package chapter.eight.multidimensional.arrays;

import chapter6_methods.PointPosition;

import java.util.Scanner;

public class SameLine {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter five points: ");
        var array = new double[5][2];
        for (var i = 0; i < array.length; i++) {
            for (var j = 0; j < array[0].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        if (sameLine(array)) {
            System.out.println("The five points are on the same line.");
        } else {
            System.out.println("The five points are not on the same line.");
        }
    }

    public static boolean sameLine(double[][] points) {
        boolean onLine = true;
        for (double[] point : points) {
            if (!PointPosition.onTheSameLine(points[0][0], points[0][1], points[1][0], points[1][1], point[0],
                    point[1])) {
                onLine = false;
                break;
            }
        }
        return onLine;
    }
}
