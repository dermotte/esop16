package at.aau.itec.esop16.lesson10;

import java.io.ByteArrayInputStream;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 19.01.2017 14:53.
 */
public class InputStreamFun {
    public static void main(String[] args) {
        byte[] data = "Hello World!".getBytes();

        ByteArrayInputStream bin = new ByteArrayInputStream(data);
        int b;

        b = bin.read();
        while (b >-1) {
            // mache was mit gelesenen bytes
            System.out.print((char) b);
            b = bin.read();
        }
    }
}
