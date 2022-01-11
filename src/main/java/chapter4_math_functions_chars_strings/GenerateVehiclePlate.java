package chapter4_math_functions_chars_strings;

import static chapter4_math_functions_chars_strings.RandomCharacter.randomChar;

/**
 * Generate vehicle plate number in format LLL-####.
 */
public class GenerateVehiclePlate
{
    public static void main(String[] args)
    {
        StringBuilder plate = new StringBuilder();

        for (int i = 0; i < 3; i++)
        {
            char letter = randomChar();
            plate.append(letter);
        }

        plate.append('-');

        for (int i = 0; i < 4; i++)
        {
            int number = (int) (Math.random() * 10);
            plate.append(number);
        }

        System.out.println("Random plate: " + plate.toString() );
    }
}
