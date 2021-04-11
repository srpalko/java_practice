package chapter7_1d_arrays;

/**
 * Generates 100 random integers between 0 and 9 and
 * displays the count for each number.
 */
public class CountSingleDigits
{
    public static void main(String[] args)
    {
        int[] random = generateRandomIntArray(100);
        int[] count = getCountArray(random);

        for (int i = 0; i < count.length; i++)
        {
            System.out.println("Count for " + i + ": " + count[i]);
        }
    }

    public static int[] generateRandomIntArray(int size)
    {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static int[] getCountArray(int[] array)
    {
        int[] count = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            count[array[i]]++;
        }
        return count;
    }
}
