package at.aau.itec.esop16.lesson03;

import java.util.Scanner;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 13.10.2016 14:17.
 */
public class FunWithWhile01Alternative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.out.println(input);
        int input, summe = 0;
        while (true) {
            input = s.nextInt();
            if (input <= 0) break;
            summe += input;
        }
        System.out.println("summe = " + summe);
    }
}
