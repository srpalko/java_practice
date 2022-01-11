package chapter10_object_oriented_thinking;

import org.w3c.dom.ls.LSOutput;

public class TestMyCharacter
{
    public static void main(String[] args)
    {
        MyCharacter test = new MyCharacter('g');

        System.out.println(test.charValue());
        System.out.println(MyCharacter.isAlphabetic('d'));
        System.out.println(MyCharacter.compare('t', 'a'));
        System.out.println(MyCharacter.getNumericValue('a'));
        System.out.println(MyCharacter.isLetterOrDigit('#'));
        System.out.println(MyCharacter.toLowerCase('F'));
    }
}
