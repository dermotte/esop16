package at.aau.itec.esop16.lesson10;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 24.01.2017 10:39.
 */
public class InputStreamIntoFile {
    public static void main(String[] args) throws IOException{
        String s = "Hello World!\n";
        FileOutputStream fos = new FileOutputStream("./temp.txt");
        fos.write(s.getBytes());
        fos.close();
    }
}
