package chapter.eight.multidimensional.arrays;

import chapter2_elementary.TriangleArea;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double[][] points = new double[3][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        var area = getTriangleArea(points);
        if (area == 0.0) {
            System.out.println("The three points are on the same line.");
        } else {
            System.out.printf("The area of the triangle is %.2f", area);
        }
    }


    public static double getTriangleArea(@org.jetbrains.annotations.NotNull double[][] points) {
        var side1 = TriangleArea.sideCalc(points[0][0], points[0][1], points[1][0], points[1][1]);
        var side2 = TriangleArea.sideCalc(points[1][0], points[1][1], points[2][0], points[2][1]);
        var side3 = TriangleArea.sideCalc(points[2][0], points[2][1], points[0][0], points[0][1]);
        var s = (side1 + side2 + side3) / 2.0;
        var area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        if (Double.isNaN(area)) {
            return 0;
        } else {
            return area;
        }
    }
}
