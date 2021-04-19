package chapter10_object_oriented_thinking;

/**
 * Manual implementation of the Character class
 */
public class MyCharacter
{
    private char value;

    public MyCharacter(char value)
    {
        this.value = value;
    }

    public char charValue()
    {
        return value;
    }

    public static int compare(char x, char y)
    {
        if (x < y)
        {
            return -1;
        }
        else if (x > y)
        {
            return 1;
        }
        else return 0;
    }

    public int compareTo(MyCharacter anotherCharacter)
    {
        return MyCharacter.compare(value, anotherCharacter.value);
    }

    public static int getNumericValue(char ch)
    {
        return ch;
    }

    public static boolean isAlphabetic(int codePoint)
    {
        return codePoint >= 65 && codePoint <= 90 || codePoint >= 97 && codePoint <= 122;
    }

    public static boolean isDigit(char ch)
    {
        return ch >= 48 && ch <= 57;
    }

    public static boolean isUpperCase(char c)
    {
        return c >= 65 && c <= 90;
    }

    public static boolean isLetterOrDigit(char ch)
    {
        return MyCharacter.isAlphabetic(ch) || MyCharacter.isDigit(ch);
    }

    public static char toLowerCase(char ch)
    {
        if (MyCharacter.isUpperCase(ch))
        {
            return (char) (ch + 32);
        }
        return ch;

    }

    public static MyCharacter valueOf(char c)
    {
        return new MyCharacter(c);
    }

}
