package chapter7_1d_arrays;

/**
 * Displays one solution of the Eight Queens puzzle.
 * The classic Eight Queens puzzle is to place eight queens on a chessboard such that no two queens
 * can attack each other. (i.e., no two queens are on the same row, same column, or same diagonal).
 * There are many possible solutions.
 * This version is implemented using only single dimensional arrays intentionally.
 */
public class EightQueens
{
    public static void main(String[] args)
    {
        /*
        This array stores the queens' location in each row
        of the chess board.
         */
        int[] queenLocationInRow;
        
        // Set a loop to brute force solve the puzzle.
        boolean solved;
        do
        {
            queenLocationInRow = new int[8];
            solved = generateBoard(queenLocationInRow);
        } while (!solved);
        
        // Display the board
        displayBoard(queenLocationInRow);
    } // end main

    /**
     * Generates the array of locations of queens in each row of a chessboard.
     * As per the rules of the puzzle, only one queen can be placed on any given
     * row, and in any one column. This method works by picking a random column in each
     * row that does not interfere with the previously selected queens.
     * If it fails, it returns false, and can be run again until it succeeds.
     * @param queenLocationsInRow the array to store locations into.
     * @return true if the puzzle is solved successfully. False if it is not.
     */
    public static boolean generateBoard(int[] queenLocationsInRow)
    {
        // Array to keep track of which columns are not legal for the next row.
        boolean[] illegalColumns = new boolean[8];
        
        // The loop runs once for each row of a chessboard (8 rows)
        for (int i = 0; i < 8; i++)
        {
            // Array of the indexes of the illegal columns.
            int[] illegalIndexes = generateIllegalIndexList(illegalColumns);
            
            /*
            Check to see if all of the columns are represented in the illegal index array.
            If they are, the puzzle cannot be solved and it must start over.
             */
            if (illegalIndexes.length == 8)
            {
                return false; // No solution
            }
            
            /*
            Randomly determine the placement of this row's queen. Choosing from the 
            indexes representing legal columns.
             */
            int queenLocation = getRandomLegalColumn(illegalIndexes);
            
            // Extra check for lack of solution. getRandomLegalColumn returns -1 if it cannot complete.
            if (queenLocation == -1)
            {
                return false;
            }
            
            // Insert queens location index in the array.
            queenLocationsInRow[i] = queenLocation;
            
            // Determine the illegal columns in the next iteration
            illegalColumns = determineNextIllegalColumns(queenLocationsInRow, i);
        }
        return true; // Correct solution 
    }

    /**
     * Determines the illegal columns in an iteration of generateBoard
     * @param queenLocationsInRow array of queen locations
     * @param depth how many rows have been processed so far
     * @return array representing which columns are legal for queen placement
     */
    public static boolean[] determineNextIllegalColumns(int[] queenLocationsInRow, int depth)
    {
        // array to hold the locations.
        // The array is regenerated on every call.
        boolean[] illegalColumns = new boolean[8];
        
        /*
        Loops to the current depth of the rows. The j index counts backward to
        provide the proper values for each queens diagonal effect on the current row.
         */
        for (int i = 0, j = depth; i <= depth; i++, j--)
        {
            // Get the queen of this row
            int currentQueenLocation = queenLocationsInRow[i];
            
            // Make illegal the column that this queen sits on
            illegalColumns[currentQueenLocation] = true;
            
            /*
            Determine the diagonal effect of this queen. It spreads out
            left and right as the rows get farther from any particular queen.
             */
            int leftDiagonal = (currentQueenLocation - 1) - j;
            int rightDiagonal = (currentQueenLocation + 1) + j;

            // Check to make sure that the index is on the board.
            // Mark it in the illegal columns list if it is.
            if (leftDiagonal >= 0 && leftDiagonal < 8)
            {
                illegalColumns[leftDiagonal] = true;
            }
            if (rightDiagonal < 8 && rightDiagonal > 0)
            {
                illegalColumns[rightDiagonal] = true;
            }
        }
        return illegalColumns;
    }


    /**
     * Generates a list of the indexes of all true values in
     * the eliminated columns array
     * @param illegalColumns array of boolean values
     * @return an array of indexes
     */
    public static int[] generateIllegalIndexList(boolean[] illegalColumns)
    {
        // Count the number of true values to get necessary array size.
        int illegalCount = 0;
        for (boolean illegal :
                illegalColumns)
        {
            if (illegal)
            {
                illegalCount++;
            }
        }

        // Create an array with the indexes of true values in the eliminate array.
        int[] illegalIndexes = new int[illegalCount];
        int nextEmptyIndex = 0;
        for (int i = 0; i < illegalColumns.length; i++)
        {
            if (illegalColumns[i])
            {
                illegalIndexes[nextEmptyIndex] = i;
                nextEmptyIndex++;
            }
        }
        return illegalIndexes;
    }

    /**
     * Returns a random number between 0 and 7 excluding the numbers passed
     * in the argument.
     * @param indexes numbers to exclude from the random choice
     * @return a random integer between 0 and 7 inclusive. Excluding integers passed as arguments.
     * returns -1 if there are no possible options.
     */
    public static int getRandomLegalColumn(int... indexes)
    {
        // Check to see if there are any possible random values
        if (indexes.length == 8)
        {
            return -1;
        }

        // Repeatedly pick random indexes until a legal one is picked
        int randomIndex;
        boolean isIllegalIndex;

        do
        {
            randomIndex = (int) (Math.random() * 8);
            isIllegalIndex = false;
            for (int index : indexes)
            {
                if (randomIndex == index)
                {
                    isIllegalIndex = true;
                    break;
                }
            }
        } while (isIllegalIndex);

        return randomIndex;
    }

    /**
     * Displays the queens on the chessboard
     * @param queenLocations array of queen locations for each row of the chessboard
     */
    public static void displayBoard(int[] queenLocations)
    {
        // Nested loop for grid 8x8
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (queenLocations[i] == j)
                {
                    System.out.print("|Q");
                } else
                {
                    System.out.print("| ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }
} // end class
