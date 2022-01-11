package io_practice;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Get specific files by extension
 */
public class Two
{
    public static void main(String[] args)
    {
        FilenameFilter filter = (dir, name) ->
                name.endsWith(".bash");

        File file = new File("C:\\Go\\lib\\time");

        String[] list = file.list(filter);

        assert list != null;
        for (String item :
                list)
        {
            System.out.println(item);
        }
    }





}
