package io_practice;

import java.io.File;

public class Six
{
    public static void main(String[] args)
    {
        File file1 = new File("io_practice/One.java");
        File file2 = new File("io_practice/Five.java");

        if (file1.compareTo(file2) > 0)
        {
            File temp = file1;
            file1 = file2;
            file2 = temp;
        }

        System.out.println("Sorted files are: " + file1 + " " + file2);
    }



}
