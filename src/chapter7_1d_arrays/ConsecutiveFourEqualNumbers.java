package chapter7_1d_arrays;

import java.util.Scanner;

public class ConsecutiveFourEqualNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.print("Enter the values: ");
        for (int i = 0; i < size; i++)
        {
            list[i] = input.nextInt();
        }

        boolean hasFourConsecutive = isConsecutiveFour(list);
        if (hasFourConsecutive)
        {
            System.out.println("The list has consecutive fours");
        }
        else
        {
            System.out.println("The list has no consecutive fours");
        }
    }


    /**
     * Tests whether an array has four consecutive numbers with the same value
     * @param values array to check
     * @return true if four consecutive ints are present
     */
    public static boolean isConsecutiveFour(int[] values)
    {
        int consecutiveCount = 1;
        int currentConsecutive = values[0];

        for (int i = 1; i < values.length; i++)
        {
            if (values[i] == currentConsecutive)
            {
                consecutiveCount++;
                if (consecutiveCount == 4)
                {
                    return true;
                }
            }
            else
            {
                currentConsecutive = values[i];
                consecutiveCount = 1;
            }
        }
        return false;
    }
}
