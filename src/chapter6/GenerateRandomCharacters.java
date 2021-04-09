package chapter6;

/**
 * Collection of methods for generating random characters.
 * Main method prints 100 uppercase letters and then 100 single digits.
 */
public class GenerateRandomCharacters
{
    public static void main(String[] args)
    {
        int count = 1;
        for (int i = 0; i < 100; i++)
        {
            if (count % 10 == 0)
            {
                System.out.println(getRandomUpperCaseLetter());
            } else
            {
                System.out.print(getRandomUpperCaseLetter() + " ");
            }
            count++;
        }
        System.out.println("\n");
        count = 1;
        for (int i = 0; i < 100; i++)
        {
            if (count % 10 == 0)
            {
                System.out.println(getRandomDigitCharacter());
            } else
            {
                System.out.print(getRandomDigitCharacter() + " ");
            }
            count++;
        }

    }



    /**
     * Gets a random char between ch1 and ch2 inclusive
     * @param ch1 lower bound of choices
     * @param ch2 upper bound
     * @return a random char
     */
    public static char getRandomCharacter(char ch1, char ch2)
    {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /**
     * Gets a random lowercase letter
     * @return a random lowercase char
     */
    public static char getRandomLowerCaseLetter()
    {
        return getRandomCharacter('a', 'z');
    }

    /**
     * Gets a random uppercase letter
     * @return a random lowercase char
     */
    public static char getRandomUpperCaseLetter()
    {
        return getRandomCharacter('A', 'Z');
    }

    /**
     * Gets a random char 0-9
     * @return A random char representing a digit
     */
    public static char getRandomDigitCharacter()
    {
        return getRandomCharacter('0', '9');
    }

    /**
     * Gets a random unicode char \u0000 - \uFFFF
     * @return a random unicode char
     */
    public static char getRandomCharacter()
    {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
