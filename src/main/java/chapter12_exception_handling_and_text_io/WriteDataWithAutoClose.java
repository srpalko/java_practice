package chapter12_exception_handling_and_text_io;

public class WriteDataWithAutoClose
{
    public static void main(String[] args) throws Exception
    {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists())
        {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (java.io.PrintWriter output = new java.io.PrintWriter(file))
        {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}
