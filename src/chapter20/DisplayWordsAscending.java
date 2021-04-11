package chapter20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplayWordsAscending
{
    public static void main(String[] args)
    {
        File file = new File(args[0]);
        try
        {
            Scanner scanner = new Scanner(file);
            ArrayList<String> list = new ArrayList<>();
            while (scanner.hasNextLine())
            {
                list.add(scanner.nextLine());
            }
            list.sort(String::compareToIgnoreCase);
            for (String word :
                    list)
            {
                System.out.println(word);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
