package io_practice;

import java.io.File;

public class Three
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Go\\lib\\boopy");
        if (file.exists())
        {
            System.out.println("Exists");
        } else
        {
            System.out.println("Does not exist");
        }
    }
}
