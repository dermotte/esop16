package at.aau.itec.esop16.lesson10;

import java.io.*;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.01.2017 10:12.
 */
public class WriteToFile {
    public static void main(String[] args) {
        File f = new File("./test.txt");
        if (f.exists()) System.out.println("File exists!");
        else System.out.println("File does not exist!");
        FileOutputStream fos;
        OutputStreamWriter osw = null;
        try {
             fos = new FileOutputStream(f, false);
             osw = new OutputStreamWriter(fos);
            for (int i=0;i<10;i++) {
                osw.write(i + "\n");
            }
            // osw.flush();
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
