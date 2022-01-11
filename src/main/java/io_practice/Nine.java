package io_practice;

import java.io.File;

public class Nine
{
    public static void main(String[] args)
    {
        File file = new File("src/io_practice/Five.java");
        long sizeInBytes = file.length();
        double sizeInKb = sizeInBytes / 1000.0;
        double sizeInMb = sizeInBytes / 1000000.0;

        System.out.println(sizeInBytes);
        System.out.println(sizeInKb);
        System.out.println(sizeInMb);
    }
}
