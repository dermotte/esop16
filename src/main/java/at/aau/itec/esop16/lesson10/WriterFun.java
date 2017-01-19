package at.aau.itec.esop16.lesson10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 19.01.2017 15:00.
 */
public class WriterFun {
    public static void main(String[] args) {
        try {
            File f = new File("./temp.txt");
            if (f.exists() || f.isDirectory()) {
                System.exit(1);
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write("Hello World! FTW \uD83D\uDE1C");
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
