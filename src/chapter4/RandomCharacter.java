package chapter4;

/**
 * Displays a random uppercase letter.
 */
public class RandomCharacter
{
    public static void main(String[] args)
    {
        char letter = randomChar();
        System.out.println("The random letter is " + letter);
    }

    public static char randomChar()
    {
        return (char) ( (int) 'A' + Math.random() * ( ( (int) 'Z' + 1) - (int) 'A') );
    }
}
