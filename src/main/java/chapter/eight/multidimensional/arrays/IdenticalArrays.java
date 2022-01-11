package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        var m1 = new int[3][3];
        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                m1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        var m2 = new int[3][3];
        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                m2[i][j] = input.nextInt();
            }
        }
        var equal = equals(m1, m2);
        if (equal) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        var found = false;
        for (var i = 0; i < m1.length; i++) {
            for (var j = 0; j < m1[i].length; j++) {
                if (m1[i][j] == m2[i][j]) {
                } else {
                    for (var k = i; k < m1.length; k++) {
                        for (var l = j; l < m1[k].length; l++) {
                            if (m1[i][j] == m2[k][l]) {
                                found = true;
                                break;
                            }
                        }
                    }
                    if (!found) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
