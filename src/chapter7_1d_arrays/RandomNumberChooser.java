package chapter7_1d_arrays;


public class RandomNumberChooser
{
    public static void main(String[] args)
    {
        System.out.println(getRandom(1, 54, 1, 2));
    }

    /**
     * Returns a random number between 1 and 54 excluding the numbers passed
     * in the argument.
     * @param numbers numbers to exclude from the random choice
     * @return a random integer between 1 and 54 inclusive. Excluding integers passed as arguments
     */
    public static int getRandom(int lowerBound, int upperBound, int... numbers)
    {
        boolean numberInArray;
        int randomNum;
        do
        {
            randomNum = (int) (lowerBound + Math.random() * upperBound);
            numberInArray = false;
            for (int number : numbers)
            {
                if (randomNum == number)
                {
                    numberInArray = true;
                    break;
                }
            }
        } while (numberInArray);

        return randomNum;
    }
}
