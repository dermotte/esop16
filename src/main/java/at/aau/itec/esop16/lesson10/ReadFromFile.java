package at.aau.itec.esop16.lesson10;

import java.io.*;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.01.2017 10:12.
 */
public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        File f = new File("./test.txt");
//        FileReader fr = new FileReader(f);
//        int character;
//        while ((character = fr.read()) > -1)
//            System.out.print((char) character);
//        fr.close();

        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
    }
}
