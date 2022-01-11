package chapter17_binary_io;

import java.io.*;
import java.util.Random;

public class CreateBinaryDataFile {
    public static void main(String[] args) {
        File file = new File("Exercise17_02.dat");
        try (DataOutputStream output = new DataOutputStream(
                        new BufferedOutputStream(new FileOutputStream(file, true)))) {
            Random generator = new Random();
            for (int i = 0; i < 100; i++) {
                output.writeInt(generator.nextInt(200));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
