package at.aau.itec.esop16.lesson10;

import java.io.File;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 19.01.2017 15:06.
 */
public class FileFunSimple {
    public static void main(String[] args) {
        File f = new File(".");
        File[] files = f.listFiles();
        for (File f_temp: files) {
            System.out.println(f_temp.getName());
        }
    }
}
