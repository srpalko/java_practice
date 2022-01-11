package io_practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ten
{
    public static void main(String[] args)
    {
        try
        {
            Path path = Paths.get("C:\\Users\\steph\\IdeaProjects\\intro_to_java_programming\\src\\io_practice\\Six.java");
            byte[] array = Files.readAllBytes(path);
            for (byte item:
                array)
            {
                System.out.println(item);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
