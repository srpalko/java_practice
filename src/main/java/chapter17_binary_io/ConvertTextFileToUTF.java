package chapter17_binary_io;

import java.io.*;
import java.util.Scanner;

public class ConvertTextFileToUTF
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Usage: java ConvertTextFileToUTF file.txt file.utf");
            System.exit(1);
        }

        File source = new File(args[0]);
        if (!source.exists())
        {
            System.out.println("That file does not exist");
            System.exit(2);
        }

        File target = new File(args[1]);
        if (target.exists())
        {
            System.out.println("That file already exists");
            System.exit(3);
        }

        try (Scanner input = new Scanner(source);
             DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(target))))
        {
            while (input.hasNext())
            {
                String line = input.nextLine();
                output.writeUTF(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("Source file is " + source.length());
        System.out.println("Target file is " + target.length());
    }
}
