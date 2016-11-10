package at.aau.itec.esop16.lesson06;

import java.util.Arrays;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 10.11.2016 15:16.
 */
public class FunWithStrings {
    public static void main(String[] args) {
        char[] myData = new char[]{'f', 'o', 'o'};
        String foo = new String(myData);
        // System.out.println(foo);

        String alphabet = new String("abcdefghijklmnopqrstuvwxyz");
        System.out.println(alphabet.charAt(10));

        String f = "Donaudampfschifffahrt";
        String  out = "";
        for (int i = f.length()-1; i >=0; i--) {
            out = out + f.charAt(i);
        }
        System.out.println(out);


        String file = "paper.pdf";
        int index = file.lastIndexOf('.');
        System.out.println("File type is " + file.substring(index+1));
    }
}
