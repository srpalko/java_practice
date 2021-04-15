package chapter7_single_dimensional_arrays;

import java.util.Scanner;

/**
 * Prompts user to enter values for a, b, and c and displays the number of real
 * roots and all real roots.
 * Also a method for solving quadratic equations.
 */
public class SolveQuadratic
{
    public static void main(String[] args)
    {
        // Array to store coefficients
        double[] coefficients = new double[3];

        // Get the user input
        Scanner input = new Scanner(System.in);
        System.out.println("Solve quadratic equation ax\u00B2 + bx + c = 0");
        System.out.print("Enter values for a, b, and c: ");
        for (int i = 0; i < coefficients.length; i++)
        {
            coefficients[i] = input.nextDouble();
        }

        // Array of roots
        double[] roots = new double[2];

        // Solve equations
        int numberOfRoots = solveQuadratic(coefficients, roots);

        // Display results
        if (numberOfRoots == 2)
        {
            System.out.println("There are two roots. They are x = " + roots[0] +
                               " and x = " + roots[1]);
        }
        else if (numberOfRoots == 1)
        {
            System.out.println("There is one root. It is x = " + roots[0]);
        }
        else
        {
            System.out.println("There are no real roots to this equation");
        }
    }

    /**
     * The coefficients of a quadratic equation ax^2 + bx + c = 0 are passed
     * to the array eqn and the real roots are stored in roots.
     * @param eqn array of coefficients
     * @param roots array to store roots
     * @return the number of roots
     */
    public static int solveQuadratic(double[] eqn, double[] roots)
    {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = Math.pow( (b * b) - (4 * a * c), 0.5);
        if (discriminant > 0)
        {
            roots[0] = (-b + discriminant) / (2 * a);
            roots[1] = (-b - discriminant) / (2 * a);
            return 2;
        } else if (discriminant == 0)
        {
            roots[0] = (-b + discriminant) / (2 * a);
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
