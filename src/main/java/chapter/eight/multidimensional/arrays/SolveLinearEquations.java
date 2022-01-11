package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

public class SolveLinearEquations {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter values for a00, a01, a10, a11, b0, and b1: ");
        var a = new double[2][2];
        var b = new double[2];
        for (var i = 0; i < a.length; i++) {
            for (var j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        for (var i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();
        }
        var result = linearEquation(a, b);
        assert result != null;
        System.out.println("The result of the equation is x = " + result[0] + ", y = " + result[1]);
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        if ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]) == 0) {
            System.out.println("The equation has no solution.");
            return null;
        }
        var x = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        var y = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        return new double[]{x, y};

    }
}
