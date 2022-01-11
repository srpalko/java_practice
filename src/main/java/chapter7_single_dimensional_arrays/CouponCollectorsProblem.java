package chapter7_single_dimensional_arrays;

/**
 * Coupon collector is a classic statistics problem with many practical applications. The problem is to pick object
 * from a set of objects repeatedly and find out how many picks are needed for all the objects to be picked at
 * least once. A variation of the problem is to pick cards from a shuffled deck of 52 cards repeatedly and find
 * out how many picks are needed before you see one of each suit. It is assumed that a picked card is placed back
 * in the deck before picking another.
 * This program simulates the number of picks needed to get four cards from each suit and display the four cards
 * picked (it is possible a card may be picked twice).
 */
public class CouponCollectorsProblem
{
    public static void main(String[] args)
    {
        // Array to keep track of which suits have been picked
        boolean[] allSuitsPicked = new boolean[4];

        // Array to keep track of the first card of each suit that is picked.
        String[] picks = new String[4];

        // Counter to keep track of how many cards are picked
        int numberOfPicks = 0;

        // The next available index in picks array
        int next = 0;

        // How many suits have been picked
        int suitsFound = 0;

        do
        {
            // Get a card from deck. Same as shuffling?
            int randomCard = getRandomCard();
            numberOfPicks++;
            // Check for previously not found suit and update counters and arrays
            if (checkForNewSuit(allSuitsPicked, randomCard))
            {
                picks[next] = decipherCardData(randomCard);
                next++;
                suitsFound++;
            }
        }
        while (suitsFound < 4);

        // display the results
        System.out.println("All suits found.");
        System.out.println(numberOfPicks + " cards were picked.");
        System.out.println("Four cards representing the four classes:");
        for (String card :
                picks)
        {
            System.out.println(card);
        }

    }

    /**
     * Picks a random card out of 52
     * @return the value of the card
     */
    public static int getRandomCard()
    {
        return (int) (Math.random() * 52);
    }


    /**
     * Checks an array of booleans representing card suits to see if that
     * suit has been observed.
     * @param allSuitsPicked array of booleans
     * @param nextCard card to process
     * @return true if it is a newly encountered suit
     */
    public static boolean checkForNewSuit(boolean[] allSuitsPicked, int nextCard)
    {
        // Find the suit of the card
        int rank = nextCard / 13;

        if (!allSuitsPicked[rank])
        {
            allSuitsPicked[rank] = true;
            return true;
        }
        return false;
    }

    /**
     * Converts a cards integer representation into a string representing
     * the value of the card
     * @param card card number to process
     * @return string representing the card
     */
    public static String decipherCardData(int card)
    {
        // find the suit and rank of card
        int suit = card / 13;
        int rank = card % 13 + 1;

        String suitName = "";
        switch (suit)
        {
            case 0:
                suitName = "Clubs";
                break;
            case 1:
                suitName = "Diamonds";
                break;
            case 2:
                suitName = "Hearts";
                break;
            case 3:
                suitName = "Spades";
                break;
        }

        String rankName = "";
        switch (rank)
        {
            case 1:
                rankName = "Ace";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                rankName = String.valueOf(rank);
                break;
            case 11:
                rankName = "Jack";
                break;
            case 12:
                rankName = "Queen";
                break;
            case 13:
                rankName = "King";
        }
        return rankName + " of " + suitName;
    }
} // end class


