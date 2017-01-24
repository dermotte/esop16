package at.aau.itec.esop16.lesson10;

import java.io.*;
import java.util.SimpleTimeZone;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 19.01.2017 15:00.
 */
public class WriterFunNew {
    public static void main(String[] args) throws IOException {
        // mit writer
        String fileName = "./temp.txt";
        FileWriter fw = new FileWriter(fileName);
        fw.write("Hello World!");
        fw.close();
        // mit stream
        FileOutputStream fo = new FileOutputStream(fileName);
        fo.write("Hello World!".getBytes()); // <-- unterschied: byte[] statt char[]
        fo.close();


        // anstatt einzelner char werte ...
        FileReader fr = new FileReader(fileName);
        char[] buffer = new char[1024*1024];
        int length;
        String stringRead = "";
        while ((length = fr.read(buffer)) > 0) {
            stringRead += new String(buffer, 0, length);
        }
    }
}
