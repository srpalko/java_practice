package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

public class CentralCity {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        var numberOfCities = input.nextInt();
        System.out.print("Enter the coordinates of the cities: ");
        var coordinates = new double[numberOfCities][2];
        for (double[] row : coordinates) {
            for (var i = 0; i < row.length; i++) {
                row[i] = input.nextDouble();
            }
        }
        double[] centralCity = findCentralCity(coordinates);
        System.out.println("The central city is at (" + centralCity[0] + ", " + centralCity[1] + ")");
        System.out.println("The total distance to all other cities is " + centralCity[2]);
    }

    private static double[] findCentralCity(double[][] coordinates) {
        var shortestDistance = Double.MAX_VALUE;
        var returnArray = new double[3];
        for (var i = 0; i < coordinates.length; i++) {
            double totalDistance = 0;
            double[] currentCity = coordinates[i];
            double[] testCity = coordinates[0];
            for (var j = 0; j < coordinates.length; j++) {
                totalDistance += calculateDistance(coordinates[i], coordinates[j]);
            }
            if (totalDistance < shortestDistance) {
                shortestDistance = totalDistance;
                returnArray[0] = coordinates[i][0];
                returnArray[1] = coordinates[i][1];
            }
        }
        returnArray[2] = shortestDistance;
        return returnArray;
    }

    private static double calculateDistance(double[] start, double[] destination) {
        return Math.sqrt(Math.pow(destination[0] - start[0], 2) + Math.pow(destination[1] - start[1], 2));
    }
}
