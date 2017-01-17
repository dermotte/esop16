package at.aau.itec.esop16.lesson10;

import java.io.File;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.01.2017 10:38.
 */
public class FileFun {
    public static void main(String[] args) {
        File f = new File(".");
        System.out.println("Is it a directory? " + f.isDirectory());
        File[] subFiles = f.listFiles();
        for (int i = 0; i < subFiles.length; i++) {
            File s = subFiles[i];
            if (s.isDirectory()) {
                System.out.printf("%s (%d)\n", s.getName(), s.listFiles().length);
            } else {
                System.out.println(s.getName());
            }
        }
    }
}
