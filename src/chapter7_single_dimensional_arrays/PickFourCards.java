package chapter7_single_dimensional_arrays;

import java.util.Arrays;

import static chapter7_single_dimensional_arrays.RandomNumberChooser.getRandom;

/**
 * Picks four cards from a deck of 52 cards and computes their sum.
 * An Ace, King, Queen, and Jack represent 1, 13, 12, and 11, respectively.
 * Displays the number of picks that yields the sum of 24.
 */
public class PickFourCards
{
    public static void main(String[] args)
    {
        // Pick four random unique cards
        int[] cards = new int[4];
        for (int i = 0; i < cards.length; i++)
        {
            cards[i] = getRandom(1, 52, cards);
        }

        // compute sum
        int sum = cardValueSum(cards);
        System.out.println("Cards as integers: " + Arrays.toString(cards));
        System.out.println("Sum of values: " + sum);

        // Go through every combination and track how many add up to 24

        int[] combinationSums = fourCardCombinationSummer();
        int countOf24Sums = 0;
        for (int comboSum:
             combinationSums)
        {
            if (comboSum == 24)
            {
                countOf24Sums++;
            }
        }

        System.out.println("There are " + countOf24Sums + " combinations that have a sum of 24.");
    }

    /**
     * Calculates the sum of the values of an array of
     * ints representing playing cards
     * @param cards array of ints representing cards
     * @return the sum
     */
    public static int cardValueSum(int[] cards)
    {
        int sum = 0;
        for (int card :
                cards)
        {
            sum += card % 13;
        }
        return sum;
    }

    public static int[] fourCardCombinationSummer()
    {
        int[] fourCards = new int[4];
        int[] sums = new int[341055];
        int nextIndex = 0;

        for (int i = 1; i <= 52; i++)
        {
            for (int j = i; j <= 52 ; j++)
            {
                for (int k = j; k <= 52; k++)
                {
                    for (int l = k; l <= 52; l++)
                    {
                        fourCards[0] = i;
                        fourCards[1] = j;
                        fourCards[2] = k;
                        fourCards[3] = l;
                        sums[nextIndex] = cardValueSum(fourCards);
                        nextIndex++;
                    }
                }
            }

        }
        return sums;
    }
}
