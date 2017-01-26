package at.aau.itec.esop16.lesson11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 26.01.2017 15:16.
 */
public class FIleWith {
    public static void main(String[] args) {
        try {
            m1();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("main - finally");
        }
        System.out.println("main - finished");

    }

    public static void m1() throws IOException {
        try {
            m2();
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        } finally {
            System.out.println("m1 - finally");
        }
        System.out.println("m1 finished");
    }

    public static void m2() throws UnsupportedOperationException, IOException{
        throw new IOException("not implemented yet!");
    }
}
