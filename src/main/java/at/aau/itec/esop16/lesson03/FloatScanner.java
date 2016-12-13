package at.aau.itec.esop16.lesson03;

import java.util.Scanner;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 13.10.2016 15:27.
 */
public class FloatScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        float f = s.nextFloat();
        System.out.println("f = " + f);
    }
}
