package chapter8_multidimensional_arrays;

/**
 * Randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 * most 1s.
 */
public class LargestRowAndColumn
{
    public static void main(String[] args)
    {
        /*Randomly fill in a 4x4 matrix with 1s and 0s*/
        int[][] randomMatrix = getRandomMatrix(4, 4);

        int maxRowSum = 0;
        int maxRow = 0;
        // Print the matrix
        for (int j = 0, randomMatrixLength = randomMatrix.length; j < randomMatrixLength; j++)
        {
            int[] row = randomMatrix[j];
            int rowSum = 0;
            for (int num : row)
            {
                rowSum += num;
                if (rowSum > maxRowSum)
                {
                    maxRowSum = rowSum;
                    maxRow = j;
                }
                System.out.print(num);
            }
            System.out.println();
        }

        // find first column with the most 1s
        int maxColSum = 0;
        int maxCol = 0;
        for (int i = 0; i < randomMatrix.length; i++)
        {
            int colSum = 0;
            for (int[] matrix : randomMatrix)
            {
                colSum += matrix[i];
            }
            if (colSum > maxColSum)
            {
                maxColSum = colSum;
                maxCol = i;
            }
        }
        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxCol);
    }

    /**
     * creates an array and fills it with 1s and 0s randomly
     * @param rows rows to create
     * @param columns columns to create
     * @return a randomly filled matrix
     */
    public static int[][] getRandomMatrix(int rows, int columns)
    {
        // create matrix
        int[][] matrix = new int[rows][columns];

        // fill  with 1s and 0s randomly
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = (int) Math.round(Math.random());
            }
        }
        return matrix;
    }


}
