package chapter4;

/**
 * Displays a random uppercase letter.
 */
public class RandomCharacter
{
    public static void main(String[] args)
    {
        char letter = (char) ( (int) 'A' + Math.random() * ( ( (int) 'Z' + 1) - (int) 'A') );
        System.out.println("The random letter is " + letter);
    }
}
